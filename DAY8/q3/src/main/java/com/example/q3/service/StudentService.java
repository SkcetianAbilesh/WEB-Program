package com.example.q3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q3.model.Student;
import com.example.q3.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    StudentRepo obj;
    public Student postStudent(Student s)
    {
        return obj.save(s);
    }
    public List<Student> greaterThan(int marks)
    {
        return obj.greaterThan(marks);
    }
    public List<Student> lessThan(int marks)
    {
        return obj.lessThan(marks);
    }
}
