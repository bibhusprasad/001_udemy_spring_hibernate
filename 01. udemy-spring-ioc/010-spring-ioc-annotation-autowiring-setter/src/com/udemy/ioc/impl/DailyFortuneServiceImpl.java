package com.udemy.ioc.impl;

import org.springframework.stereotype.Component;

import com.udemy.ioc.FortuneService;

@Component
public class DailyFortuneServiceImpl implements FortuneService{

	@Override
	public String getFortuneService() {
		return "Today is your lucky day";
	}

}
