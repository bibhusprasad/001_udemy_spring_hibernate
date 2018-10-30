package com.udemy.ioc.impl;

import com.udemy.ioc.Coach;
import com.udemy.ioc.FortuneService;

public class BaseballCoachImpl implements Coach{
	
	private FortuneService fortuneService;

	public BaseballCoachImpl(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "BaseballCoachImpl :: daily 30min batting practice.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
