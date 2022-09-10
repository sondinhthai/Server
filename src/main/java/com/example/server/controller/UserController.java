package com.example.server.controller;

import com.example.server.model.Users;
import com.example.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/get-all")
    public List<Users> getAllUsers() {
        return userService.getAllEmployees();
    }

    @PostMapping("/user/save")
    public Users save(@RequestBody Users users) {
        return userService.save(users);
    }
}
