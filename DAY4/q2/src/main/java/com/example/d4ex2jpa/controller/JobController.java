package com.example.d4ex2jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.d4ex2jpa.model.Job;
import com.example.d4ex2jpa.service.JobService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @PostMapping("/addjob")
    public Job addJob(@RequestBody Job job) {
        
        return jobService.addJob(job); 
    }
    @GetMapping("/getjob")
    public List<Job> getJobs() {
        return jobService.getJobs();
    }
    
    
    
}
