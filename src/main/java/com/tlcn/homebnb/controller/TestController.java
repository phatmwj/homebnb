package com.tlcn.homebnb.controller;

import com.tlcn.homebnb.entity.User;
import com.tlcn.homebnb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }
}
