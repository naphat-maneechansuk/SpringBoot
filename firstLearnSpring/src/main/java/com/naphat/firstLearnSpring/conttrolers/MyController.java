package com.naphat.firstLearnSpring.conttrolers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
    @GetMapping("/hello")
    public String display() {
        return "Hello, Spring Boot!";
    }
    @GetMapping("/bye")
    public String bye() {
        return "Bye, Spring Boot!";
    }
}
