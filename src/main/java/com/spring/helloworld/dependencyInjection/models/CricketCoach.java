package com.spring.helloworld.dependencyInjection.models;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// The @Component annotation marks this class as a Spring bean
// A bean is available for Spring to do dependency injection
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("created: " + this.getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
