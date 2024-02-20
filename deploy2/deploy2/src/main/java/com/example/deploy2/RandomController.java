package com.example.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {

    @GetMapping("/sum")
    public int getRandomSum() {
        int first = (int) (Math.random() * 100);
        int second = (int) (Math.random() * 100);
        return first + second;
    }
}
