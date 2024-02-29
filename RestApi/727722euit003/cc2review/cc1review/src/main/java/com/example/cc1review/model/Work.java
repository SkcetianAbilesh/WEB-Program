package com.example.cc1review.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admins")
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long adminId;
    public String adminname;
    public String adminPhone;
    public String adminVehicle;
    public Long getAdminId() {
        return adminId;
    }
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }
    public String getAdminname() {
        return adminname;
    }
    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }
    public String getAdminPhone() {
        return adminPhone;
    }
    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }
    public String getAdminVehicle() {
        return adminVehicle;
    }
    public void setAdminVehicle(String adminVehicle) {
        this.adminVehicle = adminVehicle;
    }
    
}
