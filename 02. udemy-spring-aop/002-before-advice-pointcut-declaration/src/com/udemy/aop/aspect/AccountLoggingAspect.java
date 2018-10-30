package com.udemy.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountLoggingAspect {
	
	@Pointcut("execution(public void addAccount())")
	private void forDAOPackage() {}
	
	@Before("forDAOPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n===> Executing @Before advice on addAccount()");
	}
	
	
}
