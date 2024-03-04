package com.example.springapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Book;
import com.example.springapp.service.BookService;

@RestController
public class BookController {
    @Autowired
    BookService bookservice;
    @PostMapping("/api/book")
    public ResponseEntity<Book> addBooks(@RequestBody Book book)
    {
        return new ResponseEntity<>(bookservice.addBooks(book),HttpStatus.CREATED);
    }
    @PutMapping("/api/book/{bookId}")
    public ResponseEntity<Book> editBooks(@PathVariable int bookId,@RequestBody Book book)
    {
        return new ResponseEntity<>(bookservice.editBooks(bookId,book),HttpStatus.OK);
    }
    @GetMapping("/api/book")
    public ResponseEntity<List<Book>> getBooks()
    {
        return new ResponseEntity<>(bookservice.getBooks(),HttpStatus.OK);
    }
    @GetMapping("/api/book/{bookId}")
    public ResponseEntity<Optional<Book>>getBookById(@PathVariable int bookId)
    {
        return new ResponseEntity<>(bookservice.getById(bookId),HttpStatus.OK);
    }
    
}
