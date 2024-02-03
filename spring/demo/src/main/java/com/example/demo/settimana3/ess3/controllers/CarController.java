package com.example.demo.settimana3.ess3.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.settimana3.ess3.entities.Car;
import com.example.demo.settimana3.ess3.repositories.CarRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(path = "/car")
public class CarController {

    @Autowired
    CarRepository carRepository;

    @PostMapping("/newCar")
    public Car postMethodName(@RequestBody Car car) {
        @SuppressWarnings("null")
        Car newCar = carRepository.saveAndFlush(car);
        return newCar;
    }

    @GetMapping("/getAllCar")
    public List<Car> showAllCar() {
        List<Car> allCar = carRepository.findAll();
        return allCar;
    }

    @SuppressWarnings("null")
    @GetMapping("/getCarById/{id}")
    public Car showCarById(@PathVariable Long id) {
        Car car = new Car();
        boolean findCar = carRepository.existsById(id);
        if (findCar) {
            car = carRepository.getReferenceById(id);
        }
        return car;
    }

    @PatchMapping("/updateCarById/{id}")
    public Car updateCar(@PathVariable Long id, @RequestParam String type) {
        @SuppressWarnings("null")
        Optional<Car> optionalCar = carRepository.findById(id);
        Car car = new Car();
        if (optionalCar.isPresent()) {
            car = optionalCar.get();
            car.setType(type);
        }
        return car;
    }

    @SuppressWarnings("null")
    @DeleteMapping("/deleteCarById/{id}")
    public void deleteCar(@PathVariable Long id) {
        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
            ;
        }

    }

    @DeleteMapping("/deleteAll")
    public void deleteAllCar() {
        carRepository.deleteAll();
    }

}
