package com.udemy.aop.dao;

import org.springframework.stereotype.Component;

import com.udemy.aop.bean.Account;

@Component
public class AccountDAO {
	
	public void addAccount() {
		System.out.println(getClass() + " :: Add a account to DB.");
	}
	
	public void removeAccount() {
		System.out.println(getClass() + " :: Remove a account to DB.");
	}
	
	public void updateAccount(Account account) {
		System.out.println(getClass() + " :: Update a account to DB.");
	}
}
