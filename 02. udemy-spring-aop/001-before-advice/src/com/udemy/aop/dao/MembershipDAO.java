package com.udemy.aop.dao;

import org.springframework.stereotype.Component;

import com.udemy.aop.bean.Account;

@Component
public class MembershipDAO {
	
	public void addAccount() {
		System.out.println(getClass() + " :: Add membership details.");
	}
	
	public boolean removeAccount() {
		System.out.println(getClass() + " :: Remove membership details.");
		return false;
	}
	
	public void updateAccount(Account account, boolean flag) {
		System.out.println(getClass() + " :: Update membership details.");
	}

}
