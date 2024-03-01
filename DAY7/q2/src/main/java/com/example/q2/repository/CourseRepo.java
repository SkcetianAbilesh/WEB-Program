package com.example.q2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.q2.model.Course;
@Repository
public interface CourseRepo extends JpaRepository<Course,Integer>{
    @Query("select u from Course u where courseName=?1")
    List<Course> getPersonByName(String coursename);
}
