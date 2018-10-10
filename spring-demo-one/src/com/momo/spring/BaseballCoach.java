package com.momo.spring;

public class BaseballCoach implements Coach {

	
	FortuneService fortuneService;
	BaseballCoach()
	{
		System.out.println("Inside baseball default constructor");
	}
	
	BaseballCoach(FortuneService fortuneService)
	{
		System.out.println("Inside baseball param constructor");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {

		return "Did workout for about 30 minutes today";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
