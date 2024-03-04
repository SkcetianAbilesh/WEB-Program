package com.example.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.example.q1.model.Payroll;

import jakarta.transaction.Transactional;

public interface PayrollRepo extends JpaRepository<Payroll,Long>{

@Modifying
@Transactional
@Query(value="insert into payroll(payroll_id,amount,no_of_days_worked,emp_id) values(?1,?2,?3,?4)",nativeQuery = true)
void postPayroll(long payrollId,double amount,int noOfDaysWorked,long employeeId);
@Query(value = "select p.* from payroll p where p.emp_id=?1",nativeQuery = true)
Payroll getPayrollByEid(long id);

    
}