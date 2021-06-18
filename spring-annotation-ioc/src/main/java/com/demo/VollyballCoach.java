package com.demo;

import org.springframework.stereotype.Component;

@Component
public class VollyballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice more on court";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
