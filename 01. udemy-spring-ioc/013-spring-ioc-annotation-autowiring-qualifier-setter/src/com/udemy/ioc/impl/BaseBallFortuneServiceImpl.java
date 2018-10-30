package com.udemy.ioc.impl;

import org.springframework.stereotype.Component;

import com.udemy.ioc.FortuneService;

@Component("baseball")
public class BaseBallFortuneServiceImpl implements FortuneService{

	@Override
	public String getFortuneService() {
		return "Today is your lucky day";
	}

}
