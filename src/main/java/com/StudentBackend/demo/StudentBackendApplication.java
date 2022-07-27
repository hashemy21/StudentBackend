package com.StudentBackend.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentBackend.demo.Student.Student;

@SpringBootApplication
public class StudentBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentBackendApplication.class, args);
	}

}
