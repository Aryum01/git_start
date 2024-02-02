package com.example.demo.settimana3.ess1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.settimana3.ess1.entities.StudentClass;

@Repository
public interface ClassRepository extends JpaRepository<StudentClass, Long> {
}