package com.spring.helloworld.dependencyInjection.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    @PostConstruct
    public void doPostConstruct() {
        System.out.println("This method is called after bean construction.");
    }

    @PreDestroy
    public void doPreDestroy() {
        System.out.println("This method is called before bean destroy.");
    }
}
