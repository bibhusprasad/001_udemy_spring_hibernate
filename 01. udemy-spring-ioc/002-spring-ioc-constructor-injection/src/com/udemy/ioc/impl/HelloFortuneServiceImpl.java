package com.udemy.ioc.impl;

import com.udemy.ioc.FortuneService;

public class HelloFortuneServiceImpl implements FortuneService {

	@Override
	public String getFortune() {
		return "HelloFortuneServiceImpl :: Today is your lucky day!!";
	}

}
