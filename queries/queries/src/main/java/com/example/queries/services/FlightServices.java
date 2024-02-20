package com.example.queries.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.example.queries.entities.Flight;
import com.example.queries.entities.Flight.FlightStatus;
import com.example.queries.repository.FlightRepository;

@Component
public class FlightServices {

    @Autowired
    FlightRepository flightRepository;

    public FlightServices(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> createFlights(int amount) {
        List<Flight> generatedFlights = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < amount; i++) {
            Flight flight = new Flight(
                    "Flight " + (i + 1),
                    generateRandomAirportCode(),
                    generateRandomAirportCode(),
                    FlightStatus.values()[random.nextInt(FlightStatus.values().length)]);
            flightRepository.save(flight);
            generatedFlights.add(flight);
        }

        return generatedFlights;
    }

    private String generateRandomAirportCode() {
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            code.append((char) ('A' + random.nextInt(26)));
        }
        return code.toString();
    }

    public List<Flight> allFlights() {
        return flightRepository.retrieveAllFlights();
    }

}
