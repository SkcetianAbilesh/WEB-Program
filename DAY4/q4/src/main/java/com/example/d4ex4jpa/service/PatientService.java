package com.example.d4ex4jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d4ex4jpa.model.Patient;
import com.example.d4ex4jpa.repo.PatientRepo;

@Service
public class PatientService {
    @Autowired
    PatientRepo patientRepo;

    @SuppressWarnings("null")
    public Patient add(Patient patient)
    {
        return patientRepo.save(patient);
    }
    
    public List<Patient> get()
    {
        return patientRepo.findAll();
    }

    public Optional<Patient> getId(int id)
    {
        return patientRepo.findById(id);
   }
}
