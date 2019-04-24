package com.example.userservice.service;

import com.example.userservice.domain.User;
import com.example.userservice.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User getUserByUid(int uid) {
        return userRepository.findByUid(uid);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
