package com.udemy.aop;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.udemy.aop.service.TrafficFortuneService;

public class SpringApplicationContext {
	
	public static final Logger LOGGER = Logger.getLogger(SpringApplicationContext.class.getName());

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		TrafficFortuneService trafficFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
	
		LOGGER.info("Inside Application context");
		
		LOGGER.info(trafficFortuneService.getFortune());
		
		LOGGER.info("Finished");

		context.close();
	}

}
