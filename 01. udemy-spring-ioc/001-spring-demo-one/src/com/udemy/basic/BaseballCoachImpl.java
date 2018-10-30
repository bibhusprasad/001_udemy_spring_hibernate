package com.udemy.basic;

public class BaseballCoachImpl implements Coach{

	@Override
	public String getDailyWorkout() {
		return "BaseballCoachImpl :: daily 30min batting practice.";
	}

}
