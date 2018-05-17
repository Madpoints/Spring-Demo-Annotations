package com.madpoints.springdemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "5 laps freestyle";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
