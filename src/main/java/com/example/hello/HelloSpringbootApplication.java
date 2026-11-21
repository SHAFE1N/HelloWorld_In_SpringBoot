package com.example.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringbootApplication.class, args);
    }

    // Prints "Hello, World!" to the console when the app starts
    @Bean
    CommandLineRunner printHello() {
        return args -> System.out.println("Hello, World!");
    }
}
