package com.example.interceptor.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/time")
public class BasicController {

    @GetMapping
    public String getTime() {
        return LocalDateTime.now().toString();
    }
}