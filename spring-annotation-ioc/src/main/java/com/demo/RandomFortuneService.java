package com.demo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "It's a RadomFortuneService";
    }
}
