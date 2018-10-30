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
		accountDAO.addAccount();
		
		//add account
		accountDAO.addAccount();
		
		//add membership details
		membershipDAO.addAccount();
		
		accountDAO.removeAccount();
		
		membershipDAO.removeAccount();
		
		accountDAO.updateAccount(new Account());
		
		membershipDAO.updateAccount(new Account(), true);
		
		context.close();
	}

}
