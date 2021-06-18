package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practive on back move";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }


}
