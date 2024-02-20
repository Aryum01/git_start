package com.example.unitTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.unitTest.entities.UserEntities;
import com.example.unitTest.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/alluser")
    public List<UserEntities> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/getuserbyid/{id}")
    public UserEntities getUserById(@PathVariable Long id) {
        UserEntities newUser = userRepository.getReferenceById(id);
        return newUser;
    }

    @PostMapping("/createuser")
    public UserEntities createUser(@RequestBody UserEntities user) {
        return userRepository.save(user);
    }

    @PutMapping("/update/{id}")
    public UserEntities updateUser(@PathVariable Long id, @RequestBody UserEntities updatedUser) {
        UserEntities user = userRepository.getReferenceById(id);
        user.setUsername(updatedUser.getUsername());
        user.setEmail(updatedUser.getEmail());
        userRepository.save(user);
        return user;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}