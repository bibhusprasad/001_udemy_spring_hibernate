package com.udemy.ioc.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.udemy.ioc.Coach;

@Component
public class CricketCoachImpl implements Coach {

	@Value("bibhu")
	private String name;
	@Value("bibhu@gmail.com")
	private String email;
	@Value("16")
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
