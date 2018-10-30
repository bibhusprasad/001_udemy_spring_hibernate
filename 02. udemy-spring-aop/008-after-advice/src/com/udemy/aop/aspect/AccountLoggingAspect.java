package com.udemy.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AccountLoggingAspect {
	
		@After("execution(* findAccounts())")
		public void afterReturning(JoinPoint joinPoint) {
			System.out.println("\n====> Executing @After Add Account method");
			
			MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
			System.out.println(methodSignature.toShortString());
			
		}
	
}
