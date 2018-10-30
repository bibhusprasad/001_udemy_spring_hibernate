package com.udemy.ioc.impl;

import org.springframework.stereotype.Component;

import com.udemy.ioc.FortuneService;

@Component("cricket")
public class CricketFortuneServiceImpl implements FortuneService{

	@Override
	public String getFortuneService() {
		return "Today is 10 over match";
	}

}
