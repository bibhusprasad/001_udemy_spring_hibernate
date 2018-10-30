package com.udemy.basic;

public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new TrackCoachImpl();
		System.out.println(theCoach.getDailyWorkout());

	}

}
