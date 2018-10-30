package com.udemy.ioc.impl;

import com.udemy.ioc.Coach;

public class CricketCoachImpl implements Coach {

	private String teamName;
	private int teamStrength;
	private String teamEmail;

	public CricketCoachImpl(String teamName, int teamStrength, String teamEmail) {
		super();
		this.teamName = teamName;
		this.teamStrength = teamStrength;
		this.teamEmail = teamEmail;
	}

	@Override
	public String getDailyWorkout() {
		return "CricketCoachImpl :: bowl minimum 5 over.";
	}

	@Override
	public String getTeamDetails() {
		return "CricketCoachImpl :: " +  teamName + " : " + teamStrength + " : " + teamEmail;
	}

}
