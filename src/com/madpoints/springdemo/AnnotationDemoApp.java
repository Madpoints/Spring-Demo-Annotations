package com.madpoints.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from container
		Coach theCoach = context.getBean("thisCoach", Coach.class);
		
		// call method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close context
		context.close();
		
	}

}
