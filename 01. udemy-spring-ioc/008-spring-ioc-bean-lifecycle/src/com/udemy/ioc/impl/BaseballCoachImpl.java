package com.udemy.ioc.impl;

import com.udemy.ioc.Coach;

public class BaseballCoachImpl implements Coach{
	
	private String teamName;
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String getDailyWorkout() {
		return teamName + " daily 30min batting practice.";
	}
	
	public void customInitMethod() {
		System.out.println("Bean custom init method loaded.");
	}
	
	public void customDestroyMethod() {
		System.out.println("Bean custom destroy method loaded.");
	}

}
