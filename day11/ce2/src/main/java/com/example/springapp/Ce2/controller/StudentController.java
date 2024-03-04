package com.example.springapp.Ce2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Ce2.model.Student;
import com.example.springapp.Ce2.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/student")
    public ResponseEntity<Student> addStudent(@RequestBody Student student)
    {
        return new ResponseEntity<>(studentService.addStudent(student),HttpStatus.CREATED);
    }
    @GetMapping("/student")
    public ResponseEntity<List<Student>> getStudent()
    {
        return new ResponseEntity<>(studentService.getStudent(),HttpStatus.OK);
    }
    @GetMapping("/student/{id}")
    public ResponseEntity<Optional<Student>> getStudentById(@PathVariable Long id)
    {
        return new ResponseEntity<>(studentService.getStudentById(id),HttpStatus.OK);
    }
    @PutMapping("/student/{id}")
    public ResponseEntity<Student> UpdateDetails(@PathVariable Long id,@RequestBody Student student)
    {
        return new ResponseEntity<>(studentService.UpdateDetails(id,student),HttpStatus.OK);
    }
    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> DeleteDetails(@PathVariable Long id)
    {
        return new ResponseEntity<>(studentService.deleteDetails(id),HttpStatus.OK);
    }
    
}
