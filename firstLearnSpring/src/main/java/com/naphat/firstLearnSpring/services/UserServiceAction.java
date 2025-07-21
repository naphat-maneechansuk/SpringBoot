package com.naphat.firstLearnSpring.services;

import com.naphat.firstLearnSpring.entity.User;
import com.naphat.firstLearnSpring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceAction implements UserService{
    private UserRepository userRepository;

    @Autowired
    public UserServiceAction(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
    @Override
    public User findById(int id) {
        Optional<User> result = userRepository.findById(id);
        User data = null;
        if (result.isPresent()){
            data = result.get();
        }else {
            throw new RuntimeException("Did not find user id - " + id);
        }
        return data;
    }
    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }
}
