package com.udemy.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationContext {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Coach cricketCoach = context.getBean("cricketCoachImpl", Coach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getTeamDetails());
		context.close(); 
	}
}
