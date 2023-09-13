package com.min.edu.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//TODO 04 관점 외 관심사인 CCC를 정의한 Aspect 클래스
@SpringBootApplication // 실행을 위해서 선언
@Aspect // Aspect 동작을 위한 auto-proxy 작동
public class MyCCCAspect {
	
	//동작의 대상을 검색하는 pointCut
	@Pointcut("execution(public * com.min.edu.aop..*(..))")
	public void myClass() {
		
	}
	
	@Before("myClass()")
	public void before() {
		System.out.println("메소드가 실행될 것 입니다.");
	}
	
	@After("myClass()")
	public void after() {
		System.out.println("메소드가 종료 되었습니다.");
	}
	
	
}
