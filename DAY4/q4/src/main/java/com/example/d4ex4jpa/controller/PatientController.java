package com.example.d4ex4jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.d4ex4jpa.model.Patient;
import com.example.d4ex4jpa.service.PatientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @PostMapping("/add")
    public Patient add(@RequestBody Patient patient) {
        
        return patientService.add(patient);
    }
    
    @GetMapping("/get")
    public List<Patient> get() {
        return patientService.get();
    }
    
    @GetMapping("/getid/{id}")
    public Optional<Patient> getId(@PathVariable int id) {
        return patientService.getId(id);
    }
}
