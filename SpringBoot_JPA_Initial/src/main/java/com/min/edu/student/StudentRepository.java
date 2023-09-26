package com.min.edu.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentDto, Long>{

	@Query("SELECT s FROM StudentDto s WHERE s.email = ?1")
	Optional<StudentDto> findStudentByEmail(String email);
}
