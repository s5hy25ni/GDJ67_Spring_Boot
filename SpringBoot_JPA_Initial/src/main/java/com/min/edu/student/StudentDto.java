package com.min.edu.student;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class StudentDto {

	@Id //pk
	@SequenceGenerator(
			name = "student_seq", // 이름
			sequenceName = "student_seq", // 시퀀스 네임
			allocationSize = 1 // 전략
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_seq"
	)
	private Long id;
	@Transient
	private Integer age;
	private String email;
	private String name;
	private LocalDate date;
	
	public StudentDto(){
	}

	// main과 db 없이 테스트 할 때 사용
	public StudentDto(Long id, Integer age, String email, String name, LocalDate date) {
		super();
		this.id = id;
		this.age = age;
		this.email = email;
		this.name = name;
		this.date = date;
	}

	// DB 연결 후에 JPA를 통해서 자동 id등록(PK)을 통해 테스트 할 떄 사용 => StudentConfig
	public StudentDto(Integer age, String email, String name, LocalDate date) {
		super();
		this.age = age;
		this.email = email;
		this.name = name;
		this.date = date;
	}

	// DTO에 Transient를 사용하여 제외 후 age를 계산해서 넣을 때 사용
	public StudentDto(Long id, String email, String name, LocalDate date) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.date = date;
	}

	public StudentDto(String email, String name, LocalDate date) {
		super();
		this.email = email;
		this.name = name;
		this.date = date;
	}

	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", age=" + age + ", email=" + email + ", name=" + name + ", date=" + date + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// age의 멤버필드가 date에서 생성될 수 있도록 기간을 계산
	public Integer getAge() {
		return Period.between(this.date, LocalDate.now()).getYears();
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
	
}
