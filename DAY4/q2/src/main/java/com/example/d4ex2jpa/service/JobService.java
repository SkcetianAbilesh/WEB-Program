package com.example.d4ex2jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d4ex2jpa.model.Job;
import com.example.d4ex2jpa.repo.JobRepo;

@Service
public class JobService {
    @Autowired
    JobRepo jobRepo;
    @SuppressWarnings("null")
    public Job addJob(Job job)
    {
        return jobRepo.save(job);
    }
    public List<Job> getJobs()
    {
        return jobRepo.findAll();
    }
    
}
