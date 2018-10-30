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
		
		try {
			LOGGER.info(trafficFortuneService.getFortune());
		}catch(Exception e) {
			LOGGER.info("Sorry :( ");
		}
			
		LOGGER.info("Finished");

		context.close();
	}

}
