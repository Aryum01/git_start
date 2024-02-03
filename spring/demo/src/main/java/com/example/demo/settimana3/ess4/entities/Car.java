package com.example.demo.settimana3.ess4.entities;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String modelName;
    @Column(nullable = false)
    private Integer serialNumber;

    @Column(nullable = true)
    private Integer currentPrice;


}
