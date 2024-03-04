package com.example.springapp.Ce2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Ce2.model.Student;
import com.example.springapp.Ce2.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student addStudent(Student student)
    {
        return studentRepository.save(student);
    }
    public List<Student>getStudent()
    {
        return studentRepository.findAll();
    }
    public Optional<Student> getStudentById(Long id)
    {
        return studentRepository.findById(id);
    }
    public Student UpdateDetails(Long id,Student student)
    {
        Student s=studentRepository.findById(id).orElse(null);
        if(s!=null)
        {
            s.setName(student.getName());
            s.setStudentIDCard(student.getStudentIDCard());
            return studentRepository.saveAndFlush(s);
        }
        else
        return null;
    }
    public String deleteDetails(Long id)
    {
        if(studentRepository.existsById(id))
        {
            studentRepository.deleteById(id);
            return ("Deleted Student Successfully");
        }
        else
        {
            return("Student with ID "+id+" not found");
        }
    }
    
}
