package com.example.q1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.Medicine;
import com.example.q1.repo.MedicineRepo;

@Service
public class MedicineService {
    @Autowired
    MedicineRepo medicineRepo;
    @SuppressWarnings("null")
    public Medicine addMedicine(Medicine medicine)
    {
           return medicineRepo.save(medicine);
    }
    public List<Medicine> getMedicines()
    {
        return medicineRepo.findAll();
    }
    @SuppressWarnings("null")
    public Optional<Medicine> getMedicineById(Long id)
    {
        return medicineRepo.findById(id);
    }

    public Medicine editUser(Long id,Medicine ID)
    {
        @SuppressWarnings("null")
        Medicine medicineAvail=medicineRepo.findById(id).orElse(null); 
        if(medicineAvail!=null)
        {
            medicineAvail.setMedicineName(ID.getMedicineName());
            medicineAvail.setMedicineFor(ID.getMedicineFor());
            medicineAvail.setExpirtyDate(ID.getExpirtyDate());
            medicineAvail.setMedicineBrand(ID.getMedicineBrand());
            medicineAvail.setManufacturedIn(ID.getManufacturedIn());
            medicineAvail.setMedicinePrice(ID.getMedicinePrice());
            return medicineRepo.saveAndFlush(medicineAvail);
        }
        else
        return null;
    }
    @SuppressWarnings("null")
    public String deleteMedicine(Long id)
    {
        medicineRepo.deleteById(id);
        return("User Deleted");
    }
}
