package com.example.tourist_service.service;

import com.example.tourist_service.model.User;
import com.example.tourist_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User registerUser(User user);
    public Optional<User> getUserById(int id);
    public List<User> getUserList();
}
