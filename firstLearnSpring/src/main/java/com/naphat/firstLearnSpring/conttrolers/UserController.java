package com.naphat.firstLearnSpring.conttrolers;

import com.naphat.firstLearnSpring.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> data = new ArrayList<>();
        data.add(new User("naphat", "1234","GG@com" ));
        data.add(new User("naphat2", "1234","GGc@com" ));
        return data;
    }
}
