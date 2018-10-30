package com.udemy.ioc.impl;

import com.udemy.ioc.Coach;
import com.udemy.ioc.FortuneService;

public class BaseballCoachImpl implements Coach{
	
	private FortuneService FortuneService;
	
	public BaseballCoachImpl(com.udemy.ioc.FortuneService fortuneService) {
		super();
		FortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "daily 30min batting practice.";
	}

	@Override
	public String getDailyFortuneService() {
		return FortuneService.getFortuneService();
	}

}
