package com.momo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("myCrickCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println("Dependency Injection------>" + theCoach.getDailyFortune());
		context.close();

	}

}
