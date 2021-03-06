package com.udemy.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class AccountLogToCloud {

	@Before("com.udemy.aop.aspect.AccountAllAspects.forNonGetterAndSetter()")
	public void beforeAddAccountSerice() {
		System.out.println("\n====> Executing @Before for clould logging.");
	}
}
