package com.min.edu.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class studentService {

	private StudentRepository studentRepository;
	
	@Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<StudentDto> getAllStudent(){
//		return List.of(
//				new StudentDto(1L, 20, "banana@gamil.com", "banana", LocalDate.of(2000, Month.JANUARY, 5)),
//				new StudentDto(1L, 18, "tomato@gmail.com", "tomato", LocalDate.of(2002, Month.JANUARY, 5))
//				);
		return studentRepository.findAll();
	}

	public void addNewStudent(StudentDto studentDto) {
		Optional<StudentDto> studentOptional = studentRepository.findStudentByEmail(studentDto.getEmail());
		if(studentOptional.isPresent()) {
			throw new IllegalStateException("email 있음");
		}
		studentRepository.save(studentDto);
	}
	
	public void deleteStudent(Long studentId) {
		boolean exists = studentRepository.existsById(studentId);
		if(!exists) {
			throw new IllegalStateException("학생이 존재하지 않습니다.");
		}
		studentRepository.deleteById(studentId);
	}
	
	// update 및 Transaction 처리
	@Transactional
	public void updateStudent(Long studentId, String name, String email) {
		StudentDto student = studentRepository.findById(studentId).orElseThrow(()->new IllegalStateException("해당 "+studentId+" 학생은 없습니다."));
		if(name != null && name.length() > 0 && !Objects.equals(student.getName(), name)) {
			student.setName(name);
		}
		if(email != null && email.length()>0 && !Objects.equals(student.getEmail(), email)) {
			Optional<StudentDto> studentOptional = studentRepository.findStudentByEmail(email);
			if(studentOptional.isPresent()) {
				throw new IllegalStateException("존재하는 email 입니다.");
			}
			student.setEmail(email);
		}
	}
}
