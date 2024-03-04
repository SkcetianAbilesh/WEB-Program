package com.example.d11ex2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.d11ex2.model.Student;
import com.example.d11ex2.service.StudentService;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
         return studentService.add(student);
    }

    @GetMapping("/get")
    public List<Student> getStudent() {
        return studentService.get();
    }
    
    
}
