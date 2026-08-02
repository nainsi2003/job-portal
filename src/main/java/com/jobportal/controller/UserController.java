package com.jobportal.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.entity.User;
import com.jobportal.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController{

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
    @PostMapping
    public User registerUser(@RequestBody User user){
        return userService.saveUser(user);
    }

}