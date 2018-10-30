package com.udemy.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContext {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
		Coach baseballCoach = context.getBean("baseball", Coach.class);
		System.out.println(baseballCoach.getDailyWorkout());
		Coach cricketCoach = context.getBean("cricketCoachImpl", Coach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		context.close(); 
	}

}
