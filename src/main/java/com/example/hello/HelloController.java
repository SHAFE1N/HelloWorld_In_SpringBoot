package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Visit http://localhost:8080/ in the browser to see the message
    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}
