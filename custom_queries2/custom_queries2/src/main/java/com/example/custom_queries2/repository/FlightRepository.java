package com.example.custom_queries2.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.example.custom_queries2.entities.Flight;
import com.example.custom_queries2.entities.Flight.FlightStatus;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    @Query(value = "SELECT * FROM FLIGHT", nativeQuery = true)
    Page<Flight> retrieveAllFlights(Pageable pageable);

    @Query("select f from Flight f where f.status = :p1 or f.status = :p2")
    List<Flight> findByStatus(FlightStatus p1,
            FlightStatus p2);
}
