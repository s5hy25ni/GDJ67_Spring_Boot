package com.min.edu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//TODO 04 Spring에서 값 전달을 위한 VO 객체
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JobsVo {

	private String job_id;
	private String job_title;
	private int min_salary;
	private int max_salary;
	
}
