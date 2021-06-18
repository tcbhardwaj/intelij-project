package com.spring.demo;

import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.ThreadLocalRandom;

public class MyApp {
    public static void main(String[] args) {
//        Coach coach = new TrackCoach();
//        System.out.println(coach.getDailyWorkout());
        int randomNum = ThreadLocalRandom.current().nextInt(0, 3);
        System.out.println(randomNum);
    }
}
