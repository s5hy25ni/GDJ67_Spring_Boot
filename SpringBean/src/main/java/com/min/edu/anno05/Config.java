package com.min.edu.anno05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Bean Configuration을 통해서 <bean>으로 작성되었던 내용
 */
@Configuration
public class Config {
	
	@Bean(name="stu01")
	public Student student01() {
		Student stu = new Student();
		stu.setName("홍길동");
		stu.setAddr("탐라국");
		stu.setAge("200");
		return stu;
	}
	@Bean(name="stu02")
	public Student student02() {
		Student stu = new Student();
		stu.setName("또치");
		stu.setAddr("성북구");
		stu.setAge("100");		
		return stu;
	}

	public School student03() {
		School sch = new School();
		sch.setGrade(1);
		return sch;
	}
}
