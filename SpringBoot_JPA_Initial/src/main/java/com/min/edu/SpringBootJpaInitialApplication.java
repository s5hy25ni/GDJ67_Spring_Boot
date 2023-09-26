package com.min.edu;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.min.edu.student.StudentDto;

@SpringBootApplication
@RestController
public class SpringBootJpaInitialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaInitialApplication.class, args);
	}
	
//	@GetMapping
//	public String hello() {
//		return "Hello StringBoot JPA";
//	}

//	@GetMapping
//	public List<StudentDto> getAllStudent(){
//		return List.of(
//				new StudentDto(1L, 20, "banana@gamil.com", "banana", LocalDate.of(2000, Month.JANUARY, 5)),
//				new StudentDto(1L, 18, "tomato@gmail.com", "tomato", LocalDate.of(2002, Month.JANUARY, 5))
//				);
//	}
}
