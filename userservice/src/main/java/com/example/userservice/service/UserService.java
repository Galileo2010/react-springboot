package com.example.userservice.service;

import com.example.userservice.domain.User;

import java.util.List;

public interface UserService {
    public User getUserByUid(int uid);
    public List<User> getAllUsers();
}
