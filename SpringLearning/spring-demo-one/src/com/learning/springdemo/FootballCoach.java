package com.learning.springdemo;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	public FootballCoach(FortuneService fortuneService ) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice dribble and sprint";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}
}
