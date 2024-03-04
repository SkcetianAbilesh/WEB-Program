package com.example.q1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payroll")
public class Payroll {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long payrollId;
    double amount;
    int noOfDaysWorked;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id",referencedColumnName = "employeeId")
    @JsonBackReference
    Employee employee;
    public Long getPayrollId() {
        return payrollId;
    }
    public void setPayrollId(Long payrollId) {
        this.payrollId = payrollId;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getNoOfDaysWorked() {
        return noOfDaysWorked;
    }
    public void setNoOfDaysWorked(int noOfDaysWorked) {
        this.noOfDaysWorked = noOfDaysWorked;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
}
