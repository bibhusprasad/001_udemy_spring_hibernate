package com.udemy.ioc.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.udemy.ioc.Coach;

@Component("baseballCoach")
public class BaseballCoachImpl implements Coach{
	
	@Value("usa")
	private String teamName;

	@Override
	public String getDailyWorkout() {
		return teamName + " daily 30min batting practice.";
	}
	
	@PostConstruct
	public void customeInitMethod() {
		System.out.println("Bean custom init method loaded.");
	}
	
	@PreDestroy
	public void customeDestroyMethod() {
		System.out.println("Bean custom destory method loaded.");
	}

}
