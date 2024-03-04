package com.example.springapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Book;
import com.example.springapp.repository.BookRepo;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;
    public Book addBooks(Book book)
    {
        return bookRepo.save(book);
    }
    public List<Book>getBooks()
    {
        return bookRepo.findAll();
    }
    public Optional<Book> getById(int id)
    {
        return bookRepo.findById(id);
    }
    public Book editBooks(int id,Book book)
    
    {
        Book b=bookRepo.findById(id).orElse(null);
        if(b!=null)
        {
            b.setTitle(book.getTitle());
            b.setAuthor(book.getAuthor());
            b.setAvailableCopies(book.getAvailableCopies());
            b.setTotalCopies(book.getTotalCopies());
            return bookRepo.saveAndFlush(b);
        }
        else
        return null;
    }
    
}
