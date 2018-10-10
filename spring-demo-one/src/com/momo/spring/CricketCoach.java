package com.momo.spring;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public CricketCoach()
	{
		System.out.println("Cricket Coach Constructing");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setting the dependency");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "From Cricket Coach Shit";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
