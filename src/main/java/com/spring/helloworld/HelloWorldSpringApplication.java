package com.spring.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// we can explicitly list packages we want Spring to scan, when they located outside the Main class
@SpringBootApplication(
    scanBasePackages = {"com.spring.helloworld"}
)
public class HelloWorldSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldSpringApplication.class, args);
    }

}
