package com.example.tourist_service.service;

import com.example.tourist_service.model.User;
import com.example.tourist_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public User registerUser(User user){
        return  userRepository.save(user);
    }
    @Override
    public Optional<User> getUserById(int id){
        return  userRepository.findById(id);
    }
    @Override
    public List<User> getUserList(){
        return  userRepository.findAll();
    }
}
