package com.example.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Children {
    @Id
    public int babyId;
    public String babyFirstName;
    public String babyLastName;
    public String fatherName;
    public String motherName;
    public String address;
    
    public int getBabyId() {
        return babyId;
    }
    public void setBabyId(int babyId) {
        this.babyId = babyId;
    }
    public String getBabyFirstName() {
        return babyFirstName;
    }
    public void setBabyFirstName(String babyFirstName) {
        this.babyFirstName = babyFirstName;
    }
    public String getBabyLastName() {
        return babyLastName;
    }
    public void setBabyLastName(String babyLastName) {
        this.babyLastName = babyLastName;
    }
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getMotherName() {
        return motherName;
    }
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
