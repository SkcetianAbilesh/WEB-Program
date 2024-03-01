package com.example.q1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
   @Id
   Long id;
   String name;
   int age;
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
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
} 

}
