package com.udemy.aop.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {
	
	public String getFortune() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			System.out.println("Exception in delay.");
		}
		return "Heavy traffic today.";
	}

}
