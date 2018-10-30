package com.udemy.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.udemy.aop.bean.Account;
import com.udemy.aop.dao.AccountDAO;
import com.udemy.aop.dao.MembershipDAO;

public class SpringApplicationContext {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		//add account
		accountDAO.addAccount(new Account("samal", "Level 5"));
		accountDAO.updateAccount();
		
		accountDAO.setName("bibhu");
		accountDAO.setServiceCode("SER-1000");
		
		System.out.println(accountDAO.getName());
		System.out.println(accountDAO.getServiceCode());
		
		membershipDAO.addAccount();
		
		context.close();
	}

}
