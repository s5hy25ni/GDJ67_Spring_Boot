package com.min.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.min.edu.bin1.FunctionExecution;
import com.min.edu.bin1.SamsungAircon;
import com.min.edu.bin1.SamsungTelevision;
import com.min.edu.inject.UseBean;

@SpringBootApplication
public class SpringBeanApplication implements CommandLineRunner {
											// CommandLineRunner 인터페이스 구동 시점에 실행되는 코드가 자바 문자열 아규먼트 배열에 접근이 필요한 경우
	
	@Autowired
	private UseBean useBean;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBeanApplication.class, args);
		
		// 컨테이너 생성
		ApplicationContext context1 = new AnnotationConfigApplicationContext(SamsungAircon.class);
		ApplicationContext context2 = new AnnotationConfigApplicationContext(SamsungTelevision.class);
		
		// bean을 호출(@Bean, name)
		FunctionExecution airConOn = context1.getBean("airconOn",FunctionExecution.class);
		FunctionExecution airConOff = context1.getBean("powerOff",FunctionExecution.class);
		
		// bean(@Component)
		SamsungTelevision television = context2.getBean("samsungTelevision", SamsungTelevision.class);
		
		// bean 실행
		System.out.println(airConOn.toString());
		System.out.println(airConOff.toString());
		television.powerOn();
		television.powerOff();
	}

	@Override
	public void run(String... args) throws Exception {
		useBean.print();
	}
}
