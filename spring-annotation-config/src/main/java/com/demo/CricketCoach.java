package com.demo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    public CricketCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket coaching";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
