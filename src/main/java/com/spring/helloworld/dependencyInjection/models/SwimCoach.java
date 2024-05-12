package com.spring.helloworld.dependencyInjection.models;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("Created: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice from a Swim coach";
    }
}
