package com.min.edu.aop;

import org.springframework.stereotype.Component;

//TODO 02 추가 기능을 정의한 Bean 클래스 Man
@Component
public class Man implements Human {

	@Override
	public void classWork() {
		System.out.println("Man 클래스의 주 기능을 실행합니다.");
	}

}
