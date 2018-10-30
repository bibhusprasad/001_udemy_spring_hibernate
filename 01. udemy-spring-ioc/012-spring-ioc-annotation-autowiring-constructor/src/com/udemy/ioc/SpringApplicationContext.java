package com.udemy.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContext {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
		Coach baseballCoach = context.getBean("baseball", Coach.class);
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyService());
		Coach cricketCoach = context.getBean("cricketCoachImpl", Coach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyService());
		context.close(); 
	}

}
