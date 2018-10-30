package com.udemy.ioc.impl;

import com.udemy.ioc.Coach;

public class TrackCoachImpl implements Coach {

	@Override
	public String getDailyWorkout() {
		return "TrackCoachImpl :: run hard 5k daily.";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
