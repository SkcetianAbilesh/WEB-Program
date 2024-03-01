package com.example.q1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
@Id
int personId;
String firstName;
String lastName;
int age;
String gender;

public int getPersonId() {
    return personId;
}
public void setPersonId(int personId) {
    this.personId = personId;
}
public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getGender() {
    return gender;
}
public void setGender(String gender) {
    this.gender = gender;
}

    
}
