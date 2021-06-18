package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("dynamicFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practive on back move";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
