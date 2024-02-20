package com.example.demo.settimana3.ess5;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo {
  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(Demo.class);
    app.setDefaultProperties(Collections.singletonMap("server.port", "5050"));
    app.run(args);
  }
}
