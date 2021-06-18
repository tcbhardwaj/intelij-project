package com.spring.demo;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneService implements FortuneService {
    String[] fortune = {"Hey! you need to say thanks to God", "Today you have to be bit carefull", "Spend some time with family"};
    @Override
    public String getFortune() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 3);
        return fortune[randomNum];
    }
}
