package com.example.cc2reviewonlinedeliverysystem.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long userPhoneNumber;

    String userAddress;
    String userCity;
    String userState;
    String userCountry;
    String userPincode;
    String userCoupons;
    String userGender;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_phone_number")
    private Hotel hotel;

    
    public Long getUserPhoneNumber() {
        return userPhoneNumber;
    }
    public void setUserPhoneNumber(Long userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }
    public String getUserAddress() {
        return userAddress;
    }
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    public String getUserCity() {
        return userCity;
    }
    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }
    public String getUserState() {
        return userState;
    }
    public void setUserState(String userState) {
        this.userState = userState;
    }
    public String getUserCountry() {
        return userCountry;
    }
    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }
    public String getUserPincode() {
        return userPincode;
    }
    public void setUserPincode(String userPincode) {
        this.userPincode = userPincode;
    }
    public String getUserCoupons() {
        return userCoupons;
    }
    public void setUserCoupons(String userCoupons) {
        this.userCoupons = userCoupons;
    }
    public String getUserGender() {
        return userGender;
    }
    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }
    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
    
    
    
    
    
}
