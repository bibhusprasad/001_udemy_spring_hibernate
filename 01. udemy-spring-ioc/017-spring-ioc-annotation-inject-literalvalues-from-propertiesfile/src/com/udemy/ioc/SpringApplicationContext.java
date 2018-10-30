package com.udemy.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContext {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach cricketCoach = context.getBean("cricketCoachImpl", Coach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getTeamDetails());
		context.close(); 
	}
}
