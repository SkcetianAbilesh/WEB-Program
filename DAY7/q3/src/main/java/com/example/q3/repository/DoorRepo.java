package com.example.q3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.q3.model.Door;
@Repository
public interface DoorRepo extends JpaRepository<Door,Integer>{
    @Query("select u from Door u where u.accessType=?1")
    List<Door> getDoorsByType(String accessType);
}
