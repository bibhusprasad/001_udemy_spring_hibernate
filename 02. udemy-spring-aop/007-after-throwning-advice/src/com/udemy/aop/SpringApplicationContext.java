package com.udemy.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.udemy.aop.bean.Account;
import com.udemy.aop.dao.AccountDAO;
import com.udemy.aop.exception.CustomException;

public class SpringApplicationContext {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		List<Account> accountList = null;
		try {
			accountList = accountDAO.findAccounts();
		} catch (CustomException e) {
			System.out.println("Catch exception in application context.");
		}
		System.out.println(accountList);
		
		context.close();
	}

}
