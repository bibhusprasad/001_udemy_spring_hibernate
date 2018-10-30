package com.udemy.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSprigApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		System.out.println(baseballCoach.getDailyWorkout());
		
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		System.out.println(trackCoach.getDailyWorkout());
		
		Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		
		context.close(); 
	}

}
