package com.udemy.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount() {
		System.out.println(getClass() + " :: Add a account to DB.");
	}
	
}
