package com.example.q1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.Medicine;
import com.example.q1.service.MedicineService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;







@RestController
public class MedicineController {
    @Autowired
    MedicineService medicineService;
    @PostMapping("/postmed")
    public Medicine addMedicine(@RequestBody Medicine medicine) {
        
        
        return medicineService.addMedicine(medicine);
    }
    @GetMapping("/getmed")
    public List<Medicine> getMedicines() {
        return medicineService.getMedicines();
    }
    @GetMapping("/getmed/{findid}")
    public Optional<Medicine> getMethodName(@PathVariable Long findid) {
        return medicineService.getMedicineById(findid);
    }
    @PutMapping("/edituser/{id}")
    public Medicine editUser (@PathVariable Long id, @RequestBody Medicine ID) {
        
        return medicineService.editUser(id,ID);
    }
    @DeleteMapping("/deleteMedicine/{id}")
    public String deleteMedicine(@PathVariable Long id)
    {
        return medicineService.deleteMedicine(id);
    }
    
}
