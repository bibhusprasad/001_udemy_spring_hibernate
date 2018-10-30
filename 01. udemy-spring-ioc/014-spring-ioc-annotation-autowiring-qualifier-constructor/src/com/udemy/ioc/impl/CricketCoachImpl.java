package com.udemy.ioc.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.udemy.ioc.Coach;
import com.udemy.ioc.FortuneService;

@Component
public class CricketCoachImpl implements Coach {
	
	private FortuneService fortuneService;

	public CricketCoachImpl(@Qualifier("cricketFortuneServiceImpl") FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "daily 30min bowling practice.";
	}

	@Override
	public String getDailyService() {
		return fortuneService.getFortuneService();
	}

}
