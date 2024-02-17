package com.example.custom_queries2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.custom_queries2.entities.Flight;
import com.example.custom_queries2.entities.Flight.FlightStatus;
import com.example.custom_queries2.services.FlightServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
    public ResponseEntity<String> generateFlights(@RequestParam(defaultValue = "100") int amount) {
        if (amount <= 0) {
            return ResponseEntity.badRequest().body("Amount must be a positive integer.");
        }
        flightService.createFlights(amount);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getFlights")
    public Page<Flight> getAllFlights(@RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return flightService.allFlights(pageable);
    }

    @GetMapping("/getOnTimeFlights")
    public List<Flight> getOnTimeFlights() {
        List<Flight> onTimeFlight = flightService.allOnTimeFlights();
        if (onTimeFlight.isEmpty()) {
            return null;
        }
        return onTimeFlight;
    }

    @GetMapping("/searchStatus")
    public List<Flight> getFlightsByStatus(@RequestParam(name = "p1") FlightStatus p1,
            @RequestParam(name = "p2") FlightStatus p2) {
        List<Flight> flights = flightService.searchByStatus(p1, p2);
        if (flights.isEmpty()) {
            return null;
        }
        return flights;
    }

}
