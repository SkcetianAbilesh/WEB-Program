package com.example.q1.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long employeeId;
    String employeeName;
    int age;
    Long mobile;
    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference
    Payroll payroll;
    public Long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Long getMobile() {
        return mobile;
    }
    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }
    public Payroll getPayroll() {
        return payroll;
    }
    public void setPayroll(Payroll payroll) {
        this.payroll = payroll;
    }
    

}
