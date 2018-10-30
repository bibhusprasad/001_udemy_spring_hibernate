package com.udemy.ioc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.udemy.ioc.Coach;
import com.udemy.ioc.FortuneService;

@Component
public class BaseballCoachImpl implements Coach{
	
	private FortuneService fortuneService;
	
	@Autowired
	public BaseballCoachImpl(@Qualifier("baseball") FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "daily 30min batting practice.";
	}

	@Override
	public String getDailyService() {
		return fortuneService.getFortuneService();
	}

}
