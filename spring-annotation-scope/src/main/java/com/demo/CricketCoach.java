package com.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("Inside cricekt coach constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice more on sweep shot, and try helicopter shot";
    }

    @Override
    public String getDailyFortune() {
        return "Cricket fortune service";
    }

    @PostConstruct
    public void doStartupStuff() {
        System.out.println("Inside doStartupStuff");
    }

    @PreDestroy
    public void doCleanupStuff() {
        System.out.println("Inside doCleanupStuff");
    }
}
