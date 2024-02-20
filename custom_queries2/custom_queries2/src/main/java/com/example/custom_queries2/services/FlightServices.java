package com.example.custom_queries2.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.data.domain.Page;
import com.example.custom_queries2.entities.Flight;
import com.example.custom_queries2.entities.Flight.FlightStatus;
import com.example.custom_queries2.repository.FlightRepository;

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

    public Page<Flight> allFlights(Pageable pageable) {
        return flightRepository.retrieveAllFlights(pageable);
    }

    public List<Flight> allOnTimeFlights() {
        List<Flight> allFlights = flightRepository.findAll();
        List<Flight> onTimeFlights = new ArrayList<>();
        for (Flight flight : allFlights) {
            if (flight.getStatus().equals(FlightStatus.ON_TIME)) {
                onTimeFlights.add(flight);
            }
        }
        return onTimeFlights;
    }

    public List<Flight> searchByStatus(FlightStatus p1, FlightStatus p2) {
        return flightRepository.findByStatus(p1, p2);

    }

}
