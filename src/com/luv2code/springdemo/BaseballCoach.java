package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "xttbadbad";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
