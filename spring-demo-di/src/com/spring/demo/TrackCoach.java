package com.spring.demo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Spend time on Track";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
