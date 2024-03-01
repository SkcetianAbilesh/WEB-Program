package com.example.d2ex1jsonvalue.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
public class Address {
    @Value("${my.property}")
    public String property;
    @Value("${my.name}")
    public String name;
    
    
}
