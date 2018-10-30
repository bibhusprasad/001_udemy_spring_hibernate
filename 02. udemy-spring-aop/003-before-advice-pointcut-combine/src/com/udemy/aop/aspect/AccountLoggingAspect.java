package com.udemy.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountLoggingAspect {
	
	@Pointcut("execution(* com.udemy.aop.dao.*.*(..))")
	private void forDAOPackage() {}
	
	// create a pointcut for setter method 
	@Pointcut("execution(* com.udemy.aop.dao.*.set*(..))")
	private void forSetterMathod() {}
	
	// create a pointcut for getter method
	@Pointcut("execution(* com.udemy.aop.dao.*.get*(..))")
	private void forGetterMathod() {}
	
	// create a pointcut include package and exclude getter & setter method method 
	@Pointcut("forDAOPackage() && !(forSetterMathod() || forGetterMathod())")
	private void forNonGetterAndSetter() {}
	
	
	@Before("forDAOPackage()")
	public void beforeAddAccountSerice() {
		System.out.println("\n====> Executing @Before Advice method");
	}
	
	@Before("forNonGetterAndSetter()")
	public void performAPISerice() {
		System.out.println("\n====> Executing API workhop @Before Advice method");
	}
}
