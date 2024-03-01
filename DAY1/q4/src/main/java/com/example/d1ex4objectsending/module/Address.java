package com.example.d1ex4objectsending.module;

public class Address {
    String name;
    String tech;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
    public Address(String name, String tech) {
        this.name = name;
        this.tech = tech;
    }
    
}
