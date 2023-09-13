package com.min.edu.aop;

import org.springframework.stereotype.Component;

//TODO 03 추가 기능을 정의한 Bean 클래스 Woman
@Component
public class Woman implements Human {

	@Override
	public void classWork() {
		System.out.println("Woman 클래스의 주 기능을 실행합니다.");
	}

}
