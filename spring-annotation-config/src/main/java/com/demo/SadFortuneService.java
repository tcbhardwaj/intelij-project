package com.demo;

public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Hey! today is your sad day";
    }
}
