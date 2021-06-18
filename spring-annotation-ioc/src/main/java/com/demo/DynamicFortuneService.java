package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class DynamicFortuneService implements FortuneService{

    @Value("${fortune.values}")
    private String fortune;

    @Override
    public String getFortune() {
        String[] fortuneValues = fortune.split(",");
        int index = new Random().nextInt(fortuneValues.length);
        return fortuneValues[index];
    }
}
