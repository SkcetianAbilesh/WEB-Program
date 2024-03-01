package com.example.q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q2.model.Course;
import com.example.q2.repository.CourseRepo;

@Service
public class CourseService {
    @Autowired
    CourseRepo obj;
    public Course postCourse(Course entity)
    {
        return obj.save(entity);
    }
    public List<Course> getCourse()
    {
        return obj.findAll();
    }
    public List<Course> getCourseByName(String CourseName)
    {
return obj.getPersonByName(CourseName);
    }
    
}
