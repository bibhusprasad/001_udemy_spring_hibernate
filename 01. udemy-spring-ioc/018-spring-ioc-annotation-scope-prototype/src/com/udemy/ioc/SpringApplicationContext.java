package com.udemy.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContext {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach baseballCoach = context.getBean("baseballCoachImpl", Coach.class);
		Coach baseballCoach1 = context.getBean("baseballCoachImpl", Coach.class);
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(baseballCoach);
		System.out.println(baseballCoach1);
		
		Coach cricketCoach = context.getBean("cricketCoachImpl", Coach.class);
		Coach cricketCoach1 = context.getBean("cricketCoachImpl", Coach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach);
		System.out.println(cricketCoach1);
		context.close(); 
	}

}
