package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.demo")
@PropertySource("classpath:application.properties")
public class MyConfig {


    @Bean
    public Coach cricketCoach() {
        return new CricketCoach(sadFortuneService());
    }

    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }
}
