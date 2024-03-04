package com.example.d11ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d11ex2.model.Student;
import com.example.d11ex2.repo.StudentRepo;

@Service
public class StudentService {
    @Autowired 
    StudentRepo studentRepo;
    @SuppressWarnings("null")
    public Student add(Student student)
    {
        return studentRepo.save(student);
    }
    public List<Student> get()
    {
        return studentRepo.findAll();
    }

    
}