package com.min.edu.student;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student/app")
public class StudentController {

	private studentService studentService;

	@Autowired
	public void setStudentService(studentService studentService) {
		this.studentService = studentService;
	}
	
	// 전체 검색
	@GetMapping
	public List<StudentDto> hello(){
		return studentService.getAllStudent();
	}
	
	// 입력
	// RequestBody는 화면의 form 요소를 받는 annotaion이다
	// 지금은 화면이 없기 때문에 raw로 처리해야 한다.
	@PostMapping
	public void addNewStudent(@RequestBody StudentDto studentDto) {
		studentService.addNewStudent(studentDto);
	}
	
	// 삭제
	@DeleteMapping(path="{studentId}")
	public void deleteStudent(@PathVariable("studentId") Long studentId) {
		studentService.deleteStudent(studentId);
	}
	
	//수정
	@PutMapping(path="{studentId}")
	public void updateStudent(@PathVariable("studentId") Long studentId, @RequestParam(required = false) String name,
																		@RequestParam(required = false) String email) {
		studentService.updateStudent(studentId, name, email);
	}
}
