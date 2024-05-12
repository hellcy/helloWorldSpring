package com.spring.helloworld.dependencyInjection.controllers;

import com.spring.helloworld.dependencyInjection.models.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;

    // @Autowired annotation tells Spring to inject a dependency
    // Spring will scan all available components and inject automatically
    // if you only have one constructor, then @Autowired annotation is optional
    @Autowired
    public DemoController(Coach coach) {
        System.out.println("DemoController created");
        this.coach = coach;
    }

    // setter injection
    @Autowired
    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String dailyWorkout() {
        return coach.getDailyWorkout();
    }
}
