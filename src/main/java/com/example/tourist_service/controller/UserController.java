package com.example.tourist_service.controller;

import com.example.tourist_service.model.User;
import com.example.tourist_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class UserController {
    @Autowired
    UserService userService;
    //register user
    @PostMapping("/registerUser")
    public User registerUser( @RequestBody User user) {
        System.out.println("UserController.registerUser");
       return userService.registerUser(user);
    }

    // Get a Single User by Id
    @GetMapping("/user/{userId}")
    public Optional<User> getUserById(@PathVariable("userId") int userId) {
        System.out.println("UserController.getUserById");
        return userService.getUserById(userId);
    }

    /* Get All Users*/
    @GetMapping("/users")
    public List<User> getAllUsers() {
        System.out.println("UserController.getAllUsers");
        return userService.getUserList();
    }
}
