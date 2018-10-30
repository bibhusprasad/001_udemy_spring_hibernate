package com.udemy.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContext {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		System.out.println(baseballCoach.getDailyWorkout());
		context.close(); 
	}

}
