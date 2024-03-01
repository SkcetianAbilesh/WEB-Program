package com.example.q1.service;

import java.util.List;
import java.util.Optional;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.Door;
import com.example.q1.repository.DoorRepo;

@Service

public class DoorService {
    @Autowired
    DoorRepo doorRepo;
    public Door postData(Door s)
    {
       return doorRepo.save(s);
    }
    public List<Door> getData()
    {
        return doorRepo.findAll();
    }
    public List<Door>getDataByColor(String color)
    {
        return doorRepo.findByColor(color);
    }
    public List<Door>getByType(String doorType)
    {
        return doorRepo.findByDoorType(doorType);
    }
    public List<Door>getById(int id)
    {
        return doorRepo.findByDoorId(id);
    }
    public Door updateData(int doorId,String color)
    {
        Door exist=doorRepo.findById(doorId).orElse(null);
        if(exist!=null)
        {
            exist.setColor(color);
            return doorRepo.saveAndFlush(exist);

        }
        else
         return null;
    }
    public String deldata(int id)
    {
        doorRepo.deleteById(id);
        return("Door deleted succesfully");
    }
}