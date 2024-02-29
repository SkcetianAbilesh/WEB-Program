package com.example.cc2reviewonlinedeliverysystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.cc2reviewonlinedeliverysystem.model.User;
import com.example.cc2reviewonlinedeliverysystem.repo.UserRepo;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    @SuppressWarnings("null")
    public User add(User user)
    {
        return userRepo.save(user);
    }

    public List<User> get()
    {
        return userRepo.findAll();
    }

    @SuppressWarnings("null")
    public Optional<User> getId(Long id)
    {
        return userRepo.findById(id);
    }

    public User edit(Long id,User user)
    {
        @SuppressWarnings("null")
        User ua=userRepo.findById(id).orElse(null);
        if(ua!=null)
        {
            ua.setUserAddress(user.getUserAddress());
            ua.setUserCity(user.getUserCity());
            ua.setUserState(user.getUserState());
            ua.setUserCountry(user.getUserCountry());
            ua.setUserPincode(user.getUserPincode());
            ua.setUserCoupons(user.getUserCoupons());
            ua.setUserGender(user.getUserGender());
            ua.setHotel(user.getHotel());
            return  userRepo.saveAndFlush(ua);
        }
        else 
        return null;
    }

    @SuppressWarnings("null")
    public String delete(Long id)
    {
        userRepo.deleteById(id);
        return ("deleted User");
    }

    public List<User> getCity(String city)
    {
        return userRepo.findByUserCity(city);
    }

    public List<User> getOrder(int pgno,int pgs,String userCity)
    {
        return userRepo.findAll(PageRequest.of(pgno, pgs)
        .withSort(Sort.by(Sort.Direction.ASC,userCity))).getContent();
    }
}
