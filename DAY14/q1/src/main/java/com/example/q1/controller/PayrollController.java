package com.example.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.Payroll;
import com.example.q1.service.PayrollService;
@RestController
public class PayrollController {
    @Autowired
    PayrollService obj;
    @GetMapping("/employee/{id}/payroll")
    public ResponseEntity<Payroll> getMethodName(@PathVariable long id) {
        return new ResponseEntity<>(obj.getPayroll(id),HttpStatus.OK);
    }
   @PostMapping("/employee/{id}/payroll")
   public ResponseEntity<Payroll> postMethodName(@PathVariable long  id,@RequestBody Payroll payroll) {
       
       return new ResponseEntity<>(obj.postPayRoll(id,payroll),HttpStatus.OK);
   }

}
