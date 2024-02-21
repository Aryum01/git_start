package com.example.Environment_Variables;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/environment")

public class EnvironmentController {

    @Value("${devname}")
    String devname;

    @Value("${authcode}")
    String authcode;

    @GetMapping("/")
    public String greetingMessage() {

        return "hello " + devname + " " + authcode;
    }

}
