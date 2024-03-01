package com.example.q3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id
long id;
String name;
int marks;
public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getMarks() {
    return marks;
}
public void setMarks(int marks) {
    this.marks = marks;
}

}
