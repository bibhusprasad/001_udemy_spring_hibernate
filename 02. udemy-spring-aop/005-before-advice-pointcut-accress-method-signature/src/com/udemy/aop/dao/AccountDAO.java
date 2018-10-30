package com.udemy.aop.dao;

import org.springframework.stereotype.Component;

import com.udemy.aop.bean.Account;

@Component
public class AccountDAO {
	
	public String name;
	public String serviceCode;
	
	public void addAccount(Account account) {
		System.out.println(getClass() + " :: Add a account to DB.");
	}
	
	public void updateAccount() {
		System.out.println(getClass() + " :: Update a account to DB.");
	}

	public String getName() {
		System.out.println(getClass() + " :: in getName().");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + " :: in setName().");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + " :: in getServiceCode().");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + " :: in setServiceCode().");
		this.serviceCode = serviceCode;
	}
	
}
