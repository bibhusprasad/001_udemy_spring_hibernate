package com.udemy.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountLoggingAspect {
	
	@Before("execution(public void com.udemy.aop.dao.MembershipDAO.addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n===> Executing @Before advice on addAccount()");
	}
	
	@Before("execution(* remove*())")
	public void beforeRemoveAccountAdvice() {
		System.out.println("\n===> Executing @Before advice on removeAccount()");
	}
	
	@Before("execution(* update*(com.udemy.aop.bean.Account))")
	public void beforeUpdateAccountAdvice() {
		System.out.println("\n===> Executing @Before advice on updateAccount()");
	}
	
	@Before("execution(* update*(com.udemy.aop.bean.Account, ..))")
	public void beforeUpdateMembershipAdvice() {
		System.out.println("\n===> Executing @Before advice on updateMembership()");
	}
	
	
}
