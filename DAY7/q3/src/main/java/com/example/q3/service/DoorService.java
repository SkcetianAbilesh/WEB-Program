package com.example.q3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q3.model.Door;
import com.example.q3.repository.DoorRepo;

@Service
public class DoorService {
    @Autowired
    DoorRepo obj;
    public Door postDoor(Door door)
    {
       return obj.save(door);
    }
    public List<Door> getDoors()
    {
        return obj.findAll();
    }
    public Optional<Door> getDoorById(int id)
    {
        return obj.findById(id);
    }
    public List<Door> getDoorByType(String type)
    {
        return obj.getDoorsByType(type);
    }
}
