package com.example.q3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.q3.model.Village;

@Repository
public interface VillageRepo extends JpaRepository<Village,Integer>{
@Query("select u from Village u where u.villageName=?1")
Village getVillageByName(String name);
@Query("select u from Village u where u.villagePopulation=?1")
List<Village> getVillageByPopulation(int population);
 @Query("select u from Village u where u.villageId=?1")
 Village getByVillageId(int id);   
} 