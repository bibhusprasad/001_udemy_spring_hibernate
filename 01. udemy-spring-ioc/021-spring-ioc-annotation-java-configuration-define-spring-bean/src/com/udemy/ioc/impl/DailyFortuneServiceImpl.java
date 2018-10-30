package com.udemy.ioc.impl;

import com.udemy.ioc.FortuneService;

public class DailyFortuneServiceImpl implements FortuneService{

	@Override
	public String getFortuneService() {
		return "Today is ur lucky day";
	}

}
