package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoSingleton {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("vollyballCoach", Coach.class);
        Coach otherCoach = context.getBean("vollyballCoach", Coach.class);

        System.out.println(coach==otherCoach);
        System.out.println(coach);
        System.out.println(otherCoach);

        context.close();
    }
}
