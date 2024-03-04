package com.example.springapp.Ce2.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="student_id")
    StudentIDCard studentIDCard;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public StudentIDCard getStudentIDCard() {
        return studentIDCard;
    }
    public void setStudentIDCard(StudentIDCard studentIDCard) {
        this.studentIDCard = studentIDCard;
    }
    

    
    
}
