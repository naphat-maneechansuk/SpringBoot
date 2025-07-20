package com.naphat.firstLearnSpring.conttrolers;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public String getUsers() {
        return "List of users";
    }

    @GetMapping("/about")
    public String about() {
        return "About this application";
    }
    @GetMapping("/contact")
    public String contact() {
        return "Contact us at";
    }

}
