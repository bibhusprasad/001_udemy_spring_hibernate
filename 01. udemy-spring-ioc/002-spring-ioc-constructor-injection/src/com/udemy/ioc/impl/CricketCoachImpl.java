package com.udemy.ioc.impl;

import com.udemy.ioc.Coach;

public class CricketCoachImpl implements Coach {

	@Override
	public String getDailyWorkout() {
		return "CricketCoachImpl :: run 3 round of the cricket field.";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
}
