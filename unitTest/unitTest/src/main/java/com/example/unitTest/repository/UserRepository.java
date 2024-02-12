package com.example.unitTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.unitTest.entities.UserEntities;

@Repository
public interface UserRepository extends JpaRepository<UserEntities, Long> {
}