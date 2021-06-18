package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionDemoApp {
    public static void main(String[] args) {
        //read config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("tennisCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        context.close();
    }
}
