package com.spring.helloworld.dependencyInjection.configs;

import com.spring.helloworld.dependencyInjection.models.Coach;
import com.spring.helloworld.dependencyInjection.models.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    // bean id defaults to the method name: swimCoach
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
