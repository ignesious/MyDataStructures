package com.momo.spring;

public class TrackCoach implements Coach {
	String a;
	FortuneService fortuneService;
	TrackCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "RunHundred4k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
