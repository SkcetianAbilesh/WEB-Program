package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Children;
import com.example.springapp.repository.ChildrenRepo;

@Service
public class ChildrenService {
    @Autowired
    ChildrenRepo repo;

    public Children post(Children c)
    {
        return repo.save(c);
    }

    public List<Children> sort(String field)
    {
        Sort sort=Sort.by(Sort.Direction.ASC,field);
        return repo.findAll(sort);
    }

    public List<Children> page(int pageSize,int pageNumber)
    {
        Pageable page=PageRequest.of(pageNumber, pageSize);
        return repo.findAll(page).getContent();
    }

    public List<Children> getsort(int pageNumber,int pageSize,String field)
    {
          return repo.findAll(PageRequest.of(pageNumber, pageSize)
          .withSort(Sort.by(Sort.Direction.ASC,field))).getContent();
    }
}
