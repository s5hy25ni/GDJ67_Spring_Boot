package com.min.edu.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

//TODO 14 AOP를 통한 Logger 처리 클래스
@Component
@Aspect
@Slf4j
public class MapperAOP {

	@Pointcut("execution(public * com.min.edu.mapper.*Mapper.*(..))")
	public void point() {}
	
	@Before("point()")
	public void before(JoinPoint j) {
		log.info("\n\n");
		log.info("AOP 메소드 시작 전");
		log.info("AOP 사용된느 메소드 : {}", j.getSignature().getName());
		
		Object[] obj = j.getArgs();
		if(obj != null) {
			log.info("args : {}",Arrays.toString(obj));
		}
		log.info("\n\n");
	}
	
	@AfterThrowing(value="point()", throwing="exception")
	public void afterThrowing(JoinPoint j, Exception exception) {
		log.info("\n\n");
		log.info("AOP 사용되는 메소드 : {}", j.getSignature().getName());
		log.info("AOP 오류 메시지 : {}", exception.getMessage());
		log.info("\n\n");
	}
}
