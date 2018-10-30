package com.udemy.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.udemy.aop.bean.Account;

@Aspect
@Component
@Order(1)
public class AccountLoggingAspect {
	
		@Before("com.udemy.aop.aspect.AccountAllAspects.forNonGetterAndSetter()")
		public void beforeAddAccountSerice(JoinPoint joinPoint) {
			System.out.println("\n====> Executing @Before Add Account method");
			
			MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
			System.out.println("Method : " + methodSignature);
			
			Object[] args = joinPoint.getArgs();
			
			for(Object arg : args) {
				System.out.println(arg);
				
				if(arg instanceof Account) {
					Account acc = (Account) arg;
					System.out.println("Name : " + acc.getName());
					System.out.println("Level : " + acc.getLevel());
				}
			}
		}
	
}
