package com.udemy.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.udemy.aop.bean.Account;
import com.udemy.aop.exception.CustomException;

@Component
public class AccountDAO {
	
	
	public List<Account> findAccounts() throws CustomException {
		System.out.println(getClass() + " :: fetch list of accounts from DB.");
		List<Account> accountList = new ArrayList<>();
		accountList.add(new Account("bibhu", "LEVEL 5"));
		accountList.add(new Account("ankita", "LEVEL 4"));
		accountList.add(new Account("sonali", "LEVEL 2"));
		if(3 == accountList.size()) {
			throw new CustomException("Custome exception. Size must not 3");
		}
		return accountList;
	}
}
