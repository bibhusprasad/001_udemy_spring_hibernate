package com.udemy.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.udemy.ioc.impl.BaseballCoachImpl;
import com.udemy.ioc.impl.DailyFortuneServiceImpl;

@Configuration
public class SprigContext {
	
	@Bean
	public FortuneService getFortuneService() {
		return new DailyFortuneServiceImpl();
	}
	
	@Bean
	public Coach getBaseballCoach() {
		BaseballCoachImpl baseballCoach = new BaseballCoachImpl(getFortuneService());
		return baseballCoach;
	}
}
