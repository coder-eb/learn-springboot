package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings My Lord!";
    }

    @GetMapping("/home")
    public String home() {
        return "You've reached the home page!";
    }
}
