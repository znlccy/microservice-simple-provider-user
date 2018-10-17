package com.znlccy.microservicesimpleprovideruser.controller;

import com.znlccy.microservicesimpleprovideruser.entity.User;
import com.znlccy.microservicesimpleprovideruser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/simple/{id}")
    public User findById(@PathVariable Long id) {
        return this.userRepository.findOne(id);
    }
}
