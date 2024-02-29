package com.example.cc1review.model;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long userId;
    @JsonProperty("Goods Storage")
    public String userAddress;
    @JsonProperty("AC compartent")
    public String userPhone;
    @JsonIgnore
    public String userFood;
    public String TrainNumber;
    public String TrainPlatform;
    public String TrainRegistration;
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUserAddress() {
        return userAddress;
    }
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    public String getUserPhone() {
        return userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    public String getUserFood() {
        return userFood;
    }
    public void setUserFood(String userFood) {
        this.userFood = userFood;
    }
    public String getTrainNumber() {
        return TrainNumber;
    }
    public void setTrainNumber(String trainNumber) {
        TrainNumber = trainNumber;
    }
    public String getTrainPlatform() {
        return TrainPlatform;
    }
    public void setTrainPlatform(String trainPlatform) {
        TrainPlatform = trainPlatform;
    }
    public String getTrainRegistration() {
        return TrainRegistration;
    }
    public void setTrainRegistration(String trainRegistration) {
        TrainRegistration = trainRegistration;
    }
    
}
