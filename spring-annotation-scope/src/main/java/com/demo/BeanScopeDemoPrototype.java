package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoPrototype {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach otherCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(coach==otherCoach);
        System.out.println(coach);
        System.out.println(otherCoach);

        context.close();
    }
}
