package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.Payroll;
import com.example.q1.repository.EmployeeRepo;
import com.example.q1.repository.PayrollRepo;

@Service
public class PayrollService {
@Autowired
PayrollRepo payrollRepo;
@Autowired
EmployeeRepo employeeRepo;
public Payroll postPayRoll(long id,Payroll payroll)
    {
        if(employeeRepo.existsById(id))
        {
          payrollRepo.postPayroll(payroll.getPayrollId(), payroll.getAmount(),payroll.getNoOfDaysWorked(), id);
          return payroll;
        }
        else{
            return null;
        }
    }
    public Payroll getPayroll(long id)
    {
        if(employeeRepo.existsById(id))
        {
            return payrollRepo.getPayrollByEid(id);
        }
        else{
            return null;
        }
   }

} 