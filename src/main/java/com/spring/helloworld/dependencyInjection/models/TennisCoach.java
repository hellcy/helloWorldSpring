package com.spring.helloworld.dependencyInjection.models;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice for Tennis coach";
    }
}
