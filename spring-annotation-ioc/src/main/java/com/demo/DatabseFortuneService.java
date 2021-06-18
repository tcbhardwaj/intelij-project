package com.demo;

import org.springframework.stereotype.Component;

@Component
public class DatabseFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "It's a DatabseFortuneService";
    }
}
