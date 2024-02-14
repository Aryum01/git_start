package com.example.interceptor2.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/basic")

public class BasicController {

    @GetMapping("/")
    public String getMethodName() {
        return "Welcome to the root mapping!";
    }

}
