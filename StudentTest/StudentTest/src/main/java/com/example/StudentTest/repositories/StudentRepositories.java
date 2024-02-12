package com.example.StudentTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentTest.entities.Student;

@Repository
public interface StudentRepositories extends JpaRepository<Student, Long>{
    
}
