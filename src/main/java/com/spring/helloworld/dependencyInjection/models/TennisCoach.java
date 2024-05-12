package com.spring.helloworld.dependencyInjection.models;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("created: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for Tennis coach";
    }
}
