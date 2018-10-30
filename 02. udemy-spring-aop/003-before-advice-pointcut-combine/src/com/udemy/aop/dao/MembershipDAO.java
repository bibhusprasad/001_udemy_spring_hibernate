package com.udemy.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public void addAccount() {
		System.out.println(getClass() + " :: Add membership details.");
	}

}
