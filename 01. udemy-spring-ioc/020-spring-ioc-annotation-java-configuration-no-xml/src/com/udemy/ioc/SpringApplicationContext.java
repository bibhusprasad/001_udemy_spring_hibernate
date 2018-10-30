package com.udemy.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationContext {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SprigContext.class);
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		System.out.println(baseballCoach.getDailyWorkout());
		context.close(); 
	}

}
