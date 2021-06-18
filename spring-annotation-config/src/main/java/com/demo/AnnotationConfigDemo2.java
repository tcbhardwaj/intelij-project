package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * To test @Bean, please comment @ComponentScan annotation from MyConfig.java.
 * and enable code inside MyConfig.java
 */
public class AnnotationConfigDemo2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Coach coach = context.getBean("cricketCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        context.close();
    }
}
