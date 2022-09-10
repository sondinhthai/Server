package com.example.server.service;

import com.example.server.model.Users;
import com.example.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public Users save(Users users) {
        return repository.save(users);
    }

    public List<Users> getAllEmployees() {
        List<Users> employees = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(employees::add);
        return employees;
    }

    public void delete(int userId) {
        repository.deleteById(userId);
    }
}
