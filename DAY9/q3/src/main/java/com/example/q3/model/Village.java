package com.example.q3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Village {
  @Id
  int villageId;
  String villageName;
  int numofMen;
  int numOfWomen;
  int villagePopulation;
  int numOfSchools;
public int getVillageId() {
    return villageId;
}
public void setVillageId(int villageId) {
    this.villageId = villageId;
}
public String getVillageName() {
    return villageName;
}
public void setVillageName(String villageName) {
    this.villageName = villageName;
}
public int getNumofMen() {
    return numofMen;
}
public void setNumofMen(int numofMen) {
    this.numofMen = numofMen;
}
public int getNumOfWomen() {
    return numOfWomen;
}
public void setNumOfWomen(int numOfWomen) {
    this.numOfWomen = numOfWomen;
}
public int getVillagePopulation() {
    return villagePopulation;
}
public void setVillagePopulation(int villagePopulation) {
    this.villagePopulation = villagePopulation;
}
public int getNumOfSchools() {
    return numOfSchools;
}
public void setNumOfSchools(int numOfSchools) {
    this.numOfSchools = numOfSchools;
}  
}
