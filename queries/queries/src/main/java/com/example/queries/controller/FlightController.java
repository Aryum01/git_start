package com.example.queries.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.queries.entities.Flight;

import com.example.queries.services.FlightServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    FlightServices flightService;

    @PostMapping("/addFlights")
    public ResponseEntity<String> generateFlights(@RequestParam int amount) {
        if (amount <= 0) {
            return ResponseEntity.badRequest().body("Amount must be a positive integer.");
        }
        flightService.createFlights(amount);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getFlights")
    public List<Flight> getAllFlights() {
        return flightService.allFlights();
    }

}
