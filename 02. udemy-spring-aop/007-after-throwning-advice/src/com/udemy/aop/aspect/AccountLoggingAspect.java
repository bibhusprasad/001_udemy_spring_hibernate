package com.udemy.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AccountLoggingAspect {
	
		@AfterThrowing(pointcut = "execution(* findAccounts())",
						throwing = "exception")
		public void afterReturning(JoinPoint joinPoint, Throwable exception) {
			System.out.println("\n====> Executing @@AfterThrowing Add Account method");
			
			MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
			System.out.println(methodSignature.toShortString());
			
			System.out.println(exception);
			
			
		}
	
}
