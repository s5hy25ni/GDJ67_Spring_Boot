package com.min.edu.aop06;

import org.springframework.stereotype.Component;

//TODO 07 주기능을 정의하기 위한 Bean 클래스 RightBrain
@Component
public class RightBrain implements IPerson {

	@Override
	public void thinking() {
		System.out.println("오른쪽 뇌 작동하여 생각했음");
	}

	/*
	 * aop는 상위 부모에서 가지고 있는 메소드만 VMI 실행을 한다
	 * 따라서 interface에 구성이 되어 있지 않다면 작동의 대상이 되지 않는다. 
	 */
	public String use(String action) {
		System.out.println("반환과 argument를 가지고 있는 메소드");
		return action+"한다!";
	}
}
