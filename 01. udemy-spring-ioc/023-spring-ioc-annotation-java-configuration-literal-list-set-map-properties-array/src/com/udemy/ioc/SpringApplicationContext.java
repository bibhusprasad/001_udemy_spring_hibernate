package com.udemy.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationContext {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SprigContext.class);
		Coach baseballCoach = context.getBean("getBaseballCoach", Coach.class);
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(baseballCoach.getTeamDetails());
		context.close(); 
	}

}
