package com.madpoints.springdemo;

import org.springframework.stereotype.Component;

@Component("thisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley";
	}

}
