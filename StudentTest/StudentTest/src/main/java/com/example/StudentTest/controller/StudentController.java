package com.example.StudentTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.StudentTest.entities.Student;
import com.example.StudentTest.repositories.StudentRepositories;
import com.example.StudentTest.services.StudentServices;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    private StudentRepositories studentRepository;

    @Autowired
    private StudentServices studentServices;

    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.saveAndFlush(student);
    }

    @GetMapping("/allstudent")
    public List<Student> getAllStudent() {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    @GetMapping("/getStudentbyid/{id}")
    public Student getStudentById(@PathVariable Long id) {

        Student newStudent = studentRepository.getReferenceById(id);
        return newStudent;
    }

    @PutMapping("/updatestudentbyid/{id}")
    public Student updateStudentById(@PathVariable Long id, @RequestBody Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }

    @PatchMapping("/updatestatus/{id}")
    public ResponseEntity<Student> updateStatus(@PathVariable Long id, @RequestParam boolean working) {
        Student student = studentServices.updateIsWorking(id, working);
        return ResponseEntity.ok(student);
    }

    @SuppressWarnings("null")
    @DeleteMapping("/deletestudent/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentRepository.deleteById(id);
    }
}
