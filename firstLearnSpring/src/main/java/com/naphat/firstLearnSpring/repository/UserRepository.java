package com.naphat.firstLearnSpring.repository;

import com.naphat.firstLearnSpring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Integer> {

}
