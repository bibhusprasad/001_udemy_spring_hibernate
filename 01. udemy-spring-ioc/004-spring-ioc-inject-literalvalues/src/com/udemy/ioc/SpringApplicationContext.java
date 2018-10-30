package com.udemy.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContext {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach cricketCoachOne = context.getBean("cricketCoach", Coach.class);
		System.out.println(cricketCoachOne.getDailyWorkout());
		System.out.println(cricketCoachOne.getTeamDetails());
		
		context.close(); 
	}

}
