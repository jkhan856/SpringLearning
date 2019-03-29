package com.learning.springdemo;

public class BaseballCoach implements Coach {

	private String email;
	private String[] team;
	
	private FortuneService fortuneService;
	
/* Constructor Injection
	public BaseballCoach(FortuneService fortuneService ) {
		this.fortuneService = fortuneService;
	}
*/
	public void setTeam(String[] team) {
		this.team = team;
	}
	public String getTeam() {
		return team[(int)(Math.random()*2)];
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice batting for one hour";
	}
 
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
