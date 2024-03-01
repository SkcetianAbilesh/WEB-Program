package com.example.q3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.q3.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    @Query("select u from Student u where u.marks>?1")
    List<Student> greaterThan(int marks);
    @Query("select u from Student u where u.marks<?1")
    List<Student> lessThan(int marks);
}
