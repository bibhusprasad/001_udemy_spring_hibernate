package com.udemy.ioc.impl;

import com.udemy.ioc.Coach;

public class CricketCoachImpl implements Coach {

	private String name;
	private String email;
	private int strength;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public String getDailyWorkout() {
		return "run 3 round of the cricket field.";
	}

	public String getTeamDetails() {
		return "CricketCoach [name=" + name + ", email=" + email + ", strength=" + strength + "]";
	}
	
}
