package com.min.edu.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			StudentDto banana = new StudentDto(20, "banana@gamil.com", "banana", LocalDate.of(2000, Month.JANUARY, 5));
			StudentDto tomato = new StudentDto(18, "tomato@gmail.com", "tomato", LocalDate.of(2002, Month.JANUARY, 5));
			repository.saveAll(List.of(banana, tomato));
		};
	}
}
