package com.example.q1.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Medicines")
public class Medicine {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long medicineId;

    String medicineName;
    String medicineFor;
    String medicineBrand;
    String manufacturedIn;
    double medicinePrice;
    String expirtyDate;
    public Long getMedicineId() {
        return medicineId;
    }
    public void setMedicineId(Long medicineId) {
        this.medicineId = medicineId;
    }
    public String getMedicineName() {
        return medicineName;
    }
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    public String getMedicineFor() {
        return medicineFor;
    }
    public void setMedicineFor(String medicineFor) {
        this.medicineFor = medicineFor;
    }
    public String getMedicineBrand() {
        return medicineBrand;
    }
    public void setMedicineBrand(String medicineBrand) {
        this.medicineBrand = medicineBrand;
    }
    public String getManufacturedIn() {
        return manufacturedIn;
    }
    public void setManufacturedIn(String manufacturedIn) {
        this.manufacturedIn = manufacturedIn;
    }
    public double getMedicinePrice() {
        return medicinePrice;
    }
    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }
    public String getExpirtyDate() {
        return expirtyDate;
    }
    public void setExpirtyDate(String expirtyDate) {
        this.expirtyDate = expirtyDate;
    }
    
}
