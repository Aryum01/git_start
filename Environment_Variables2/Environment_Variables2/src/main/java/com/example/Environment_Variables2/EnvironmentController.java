package com.example.Environment_Variables2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class EnvironmentController {

    @Value("${welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/")
    public String getMethodName() {
        return welcomeMsg;
    }

}
