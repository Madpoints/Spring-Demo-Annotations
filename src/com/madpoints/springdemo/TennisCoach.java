package com.madpoints.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	// default constructor
	public TennisCoach() {
	}
	
	// spring will use any @Autowired method to resolve a dependency
	// regardless of its name
//	@Autowired
//	public void whatever(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	// configure dependency with @Autowired annotation
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
