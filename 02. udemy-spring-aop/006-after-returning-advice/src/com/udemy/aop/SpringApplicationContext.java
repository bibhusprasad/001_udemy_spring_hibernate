package com.udemy.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.udemy.aop.bean.Account;
import com.udemy.aop.dao.AccountDAO;

public class SpringApplicationContext {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		List<Account> accountList = accountDAO.findAccounts();
		System.out.println(accountList);
		
		context.close();
	}

}
