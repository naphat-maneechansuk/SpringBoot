package com.naphat.firstLearnSpring.services;

import com.naphat.firstLearnSpring.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
    User findById(int id);
    void deleteById(int id);
}
