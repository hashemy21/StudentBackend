package com.StudentBackend.demo.Student;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StduentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student hashem = new Student("Hashem", "Shafik", "CS");
			Student hamza = new Student("Hamza", "Shafik", "CS");

			repository.saveAll(List.of(hashem, hamza));
		};

	}

}
