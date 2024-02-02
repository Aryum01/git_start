package com.example.demo.ess2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ess2.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByEmail(String email);
}