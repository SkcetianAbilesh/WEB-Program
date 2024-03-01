package com.example.q3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Address {
    String name;
    @JsonIgnore
    int age;
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
    public Address(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
}
