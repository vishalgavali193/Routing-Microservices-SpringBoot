package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUsers() {
        return "User Service Running";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable String id) {
        return "User with ID: " + id;
    }
}