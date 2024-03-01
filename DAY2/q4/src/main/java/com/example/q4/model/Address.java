package com.example.q4.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Address {
    public String title;
    public String author;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="UTC")
    Date date ;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Address(String title, String author, Date date) {
        this.title = title;
        this.author = author;
        this.date = date;
    }
    
    
}
