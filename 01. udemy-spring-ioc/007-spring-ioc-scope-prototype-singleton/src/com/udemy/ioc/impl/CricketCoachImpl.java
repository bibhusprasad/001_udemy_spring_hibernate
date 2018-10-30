package com.udemy.ioc.impl;

import com.udemy.ioc.Coach;

public class CricketCoachImpl implements Coach {

	private String teamName;

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String getDailyWorkout() {
		return teamName + " daily 30min bowling practice.";
	}

}
