package com.udemy.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.udemy.aop.bean.Account;

@Aspect
@Component
@Order(1)
public class AccountLoggingAspect {
	
		@AfterReturning(pointcut = "execution(* findAccounts())",
						returning = "result")
		public void afterReturning(JoinPoint joinPoint, List<Account> result) {
			System.out.println("\n====> Executing @AfterReturning Add Account method");
			
			MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
			System.out.println(methodSignature.toShortString());
			
			System.out.println(getClass() + " :: " + result);
			
			if(!result.isEmpty()) {
				result.add(new Account("sam", "Level 0"));
			}
		}
	
}
