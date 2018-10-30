package com.udemy.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountAllAspects {
	
	
	@Pointcut("execution(* com.udemy.aop.dao.*.*(..))")
	public void forDAOPackage() {}
	
	// create a pointcut for setter method 
	@Pointcut("execution(* com.udemy.aop.dao.*.set*(..))")
	public void forSetterMathod() {}
	
	// create a pointcut for getter method
	@Pointcut("execution(* com.udemy.aop.dao.*.get*(..))")
	public void forGetterMathod() {}
	
	// create a pointcut include package and exclude getter & setter method method 
	@Pointcut("forDAOPackage() && !(forSetterMathod() || forGetterMathod())")
	public void forNonGetterAndSetter() {}
}
