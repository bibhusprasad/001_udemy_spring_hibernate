package com.udemy.ioc.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.udemy.ioc.Coach;

@Component("baseballCoach")
public class BaseballCoachImpl implements Coach{
	
	@Value("usa")
	private String teamName;

	@Override
	public String getDailyWorkout() {
		return teamName + " daily 30min batting practice.";
	}

}
