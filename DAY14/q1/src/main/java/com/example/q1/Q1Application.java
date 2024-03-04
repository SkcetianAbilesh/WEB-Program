package com.example.q1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
	info = @Info(
		title = "Employee_Service",
		version = "1.0.1",
		description = "Relation between two clases",
		contact = @Contact(
               name = "Akash",
			   email = "727722euit012@skcet.ac.in"
		)
	)
)

@SpringBootApplication
public class Q1Application {

	public static void main(String[] args) {
		SpringApplication.run(Q1Application.class, args);
	}

}
