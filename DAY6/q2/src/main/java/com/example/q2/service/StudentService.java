package com.example.q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.q2.model.Student;
import com.example.q2.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    StudentRepo obj;
    public Student postStudent(Student student)
    {
        return obj.save(student);
    }
    public List<Student> Paging(int pageNo,int pageSize)
    {
        Pageable page=PageRequest.of(pageNo,pageSize);
        return obj.findAll(page).getContent();
    }
    public List<Student>  PagingAndSorting(int pageNumber,int pageSize,String field)
    {
        Pageable page=PageRequest.of(pageNumber, pageSize,Sort.by(Sort.Direction.ASC,field));
        return obj.findAll(page).getContent();
    }
}
