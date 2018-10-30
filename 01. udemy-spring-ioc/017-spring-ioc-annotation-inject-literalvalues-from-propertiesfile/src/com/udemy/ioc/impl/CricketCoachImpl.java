package com.udemy.ioc.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.udemy.ioc.Coach;

@Component
public class CricketCoachImpl implements Coach {

	@Value("${team.name}")
	private String name;
	@Value("${team.email}")
	private String email;
	@Value("${team.strength}")
	private int strength;
	
	@Override
	public String getDailyWorkout() {
		return "run 3 round of the cricket field.";
	}

	public String getTeamDetails() {
		return "CricketCoach [name=" + name + ", email=" + email + ", strength=" + strength + "]";
	}
	
}
