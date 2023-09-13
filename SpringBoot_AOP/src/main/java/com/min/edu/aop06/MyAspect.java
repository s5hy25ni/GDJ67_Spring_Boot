package com.min.edu.aop06;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Pointcut("execution(public * com.min.edu.aop06..*(..))")
	public void userPointCutBrain() {}
	
	@Before("userPointCutBrain()")
	public void before() {
		System.out.println("우뇌가 생각을 시작합니다 (before) - Before");
	}
	
	@After("userPointCutBrain()")
	public void afterRight() {
		System.out.println("우뇌가 생각을 종료합니다 (after) - After");
	}
	
	@Around("userPointCutBrain()")
	public Object before(ProceedingJoinPoint joinPoint) {
		System.out.println("메소드 시작전 공통으로 시작됨 - Around");
		String methodName = joinPoint.getSignature().toShortString();
		
		try {
			System.out.println(methodName+" 실행 - Around");
			Object result = joinPoint.proceed();
			System.out.println(methodName+" 실행 결과 :\t"+result+" - Around");
			return result;
		} catch (Throwable e) {
			System.out.println("exception");
			e.printStackTrace();
			return null;
		}
	}
	
	@AfterReturning(value="userPointCutBrain()", returning="returnValue")
	public void afterReturning(JoinPoint join, Object returnValue) {
		System.out.println("&&&&"+join.getSignature().getName()+"&&&&");
		Object[] args = join.getArgs();
		System.out.println("리턴 값 : "+returnValue);
		
		for(Object o : args) { // index 포문 ㄱㄱ
			System.out.println("메소드를 실행하기 위한 Arguments : "+(String)o);
		}
	}
}
