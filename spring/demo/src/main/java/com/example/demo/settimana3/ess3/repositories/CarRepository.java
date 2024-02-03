package com.example.demo.settimana3.ess3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.settimana3.ess3.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
