package com.udemy.aop.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.udemy.aop.SpringApplicationContext;

@Aspect
@Component
@Order(1)
public class AccountLoggingAspect {

	public static final Logger LOGGER = Logger.getLogger(SpringApplicationContext.class.getName());

	@Around("execution(* getFortune())")
	public Object aroundFortuneService(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
		LOGGER.info("\n===> Executing @Around Fortune Service : " + methodSignature.toShortString());

		long begun = System.currentTimeMillis();
		
		Object result = null;
		
		try {
			result = proceedingJoinPoint.proceed();
		} catch (Exception e) {
			LOGGER.warning("Please try after some time");
			throw e;
		}

		long end = System.currentTimeMillis();

		long duration = end - begun;

		LOGGER.info("Time taken : " + duration / 1000.0 + "second");

		return result;

	}

}
