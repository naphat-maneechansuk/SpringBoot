package com.naphat.firstLearnSpring.conttrolers;

import com.naphat.firstLearnSpring.entity.User;
import com.naphat.firstLearnSpring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        user.setId(0);
        return userService.save(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        User myUser = userService.findById(id);
        if (myUser == null) {
            throw new RuntimeException("Did not find user id - " + id);
        }else {
            return myUser;
        }
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        User myUser = userService.findById(id);
        if (myUser == null) {
            throw new RuntimeException("Did not find user id - " + id);
        }else {
            userService.deleteById(id);
            return "Deleted user id - " + id;
        }
    }
}
