package com.example.q3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q3.model.Village;
import com.example.q3.repository.VillageRepo;

@Service
public class VillageService {
    @Autowired
    VillageRepo obj;
    public Village postVillage(Village village)
    {
        return obj.save(village);
    }
    public Village findByVillageName(String name)
    {
        return obj.getVillageByName(name);
    }
    public List<Village> findByVillagePopulation(int villagePopulation)
    {
        return obj.getVillageByPopulation(villagePopulation);
    }
    public Village findByVillageId(int id)
    {
        return obj.getByVillageId(id);
    }
}
