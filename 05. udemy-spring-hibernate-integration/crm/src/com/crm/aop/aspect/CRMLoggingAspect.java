package com.crm.aop.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
	
	private static final Logger LOGGER = Logger.getLogger(CRMLoggingAspect.class.getName());
	
	@Pointcut("execution(* com.crm.controller.*.*.*(..))")
	private void forControllerPackage() {}
	
	@Pointcut("execution(* com.crm.service.impl.*.*(..))")
	private void forServicePackage() {}
	
	@Pointcut("execution(* com.crm.dao.impl.*.*(..))")
	private void forDAOPackage() {}
	
	@Pointcut("forControllerPackage() || forServicePackage() || forDAOPackage()")
	private void forAppFlow() {}
	
	@Before("forAppFlow()")
	public void beforeAdvice(JoinPoint joinPoint) {
		String method = joinPoint.getSignature().toShortString();
		LOGGER.info("\n===> @Before Advice . Method is : " + method);
		
		Object[] args = joinPoint.getArgs();
		for(Object arg : args) {
			LOGGER.info("\n===> Argumnet : " + arg);
		}
	}
	
	@AfterReturning(pointcut="forAppFlow()", returning = "result")
	public void afterReturningAdvice(JoinPoint joinPoint, Object result) {
		
		String method = joinPoint.getSignature().toShortString();
		LOGGER.info("\n===> @AfterRrturn Advice . Method is : " + method);
		
		
		LOGGER.info("\n===> Result : " + result);
		
	}

}
