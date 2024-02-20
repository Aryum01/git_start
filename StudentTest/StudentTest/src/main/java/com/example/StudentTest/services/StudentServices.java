package com.example.StudentTest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentTest.entities.Student;
import com.example.StudentTest.repositories.StudentRepositories;

@Service
public class StudentServices {

    @Autowired
    private StudentRepositories studentRepository;

    public Student updateIsWorking(Long id, boolean isWorking) {
        Student student = studentRepository.findById(id).orElseThrow();
        student.setWorking(isWorking);
        return studentRepository.save(student);
    }
}
