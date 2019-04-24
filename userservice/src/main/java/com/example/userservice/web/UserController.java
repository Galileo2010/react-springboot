package com.example.userservice.web;

import com.example.userservice.domain.User;
import com.example.userservice.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceimpl;
    @GetMapping
    public List<User> getHomePage(){
        return userServiceimpl.getAllUsers();
    }
    @GetMapping("/uid={uid}")
    public User getUserByUid(@PathVariable int uid){
        return userServiceimpl.getUserByUid(uid);
    }
}
