package com.udemy.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.udemy.aop.bean.Account;

@Component
public class AccountDAO {
	
	
	public List<Account> findAccounts() {
		System.out.println(getClass() + " :: fetch list of accounts from DB.");
		List<Account> accountList = new ArrayList<>();
		accountList.add(new Account("bibhu", "LEVEL 5"));
		accountList.add(new Account("ankita", "LEVEL 4"));
		accountList.add(new Account("sonali", "LEVEL 2"));
		return accountList;
	}
}
