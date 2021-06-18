package com.spring.demo;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout(){
        return "spend 30 min on Baseball court";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
