package com.udemy.ioc.impl;

import org.springframework.stereotype.Component;

import com.udemy.ioc.Coach;
import com.udemy.ioc.FortuneService;

@Component("baseball")
public class BaseballCoachImpl implements Coach{
	
	FortuneService fortuneService;
	
	//@Autowired
	public BaseballCoachImpl(FortuneService fortuneService) {
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
