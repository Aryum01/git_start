package com.example.demo.ess2.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;



}