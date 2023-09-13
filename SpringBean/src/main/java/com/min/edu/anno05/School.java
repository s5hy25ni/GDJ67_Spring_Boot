package com.min.edu.anno05;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class School {

	/*
	 * 주입방안 @Autowired, @Resource 통해 주입 받을 멤버 필드 객체
	 * 작성된 bean을 주입하기 위해서는 Spring Bean Configration에 <context:annotation-driven/>가 선언되어 있어야 한다. 
	 */
	
//1) 
//	@Autowired(required = false) // required는 true인 경우 bean에서 단일 타입을 자동으로 주입, required는 true 경우 주입객체가 null이면 오류 발생 / false 경우는 null 표기
//2)
//	@Autowired
// 	@Qualifier("stu01") // 생성된 여러 개의 같은 타입의 변수 중에서 id를 통해서 선택적으로 주입
//3)
//	@jakarta.annotation.Resource(name="stu01") // 이름을 통한 java resource 주입
	private Student student;
	
	private int grade;

	public School() {
	}
	
	public School(Student student, int grade) {
		super();
		this.student = student;
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
