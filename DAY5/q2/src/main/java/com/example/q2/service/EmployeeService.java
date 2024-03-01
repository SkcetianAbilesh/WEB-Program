package com.example.q2.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q2.model.Employee;
import com.example.q2.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo obj;
    public Employee postEmployee(Employee newEmp)
    {
        return obj.save(newEmp);
    }
    public Employee updateEmployee(Long Id,Employee emp)
    {
        Employee emp1=obj.findById(Id).orElse(null);
        if(emp1!=null)
        {
            emp1.setDepartment(emp.getDepartment());
            emp1.setEmployeeEmail(emp.getEmployeeEmail());
            emp1.setEmployeeName(emp.getEmployeeName());
            emp1.setSalary(emp.getSalary());
            return obj.saveAndFlush(emp1);
        }
        else{
            return null;
        }
    }
    public Boolean deleteEmployee(Long Id)
    {
        Employee emp=obj.findById(Id).orElse(null);
        if(obj!=null)
        {
         obj.deleteById(Id);
         return true;
        }
        else{
            return false;
        }
    }
}
