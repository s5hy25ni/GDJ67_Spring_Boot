package com.min.edu.bin1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SamsungAircon implements RomoteController {
	
	public SamsungAircon() {
		log.info("삼성 에어컨 호출");
	}

	@Override
	@Bean(name="airconOn")
	public FunctionExecution powerOn() {
		log.info("@Configuration으로 생성된 SumsungAircon의 powerOn");
		return new FunctionExecution("에어켠을 켜다","에어컨");
	}

	@Override
	@Bean
	public FunctionExecution powerOff() {
		log.info("@Configuration으로 생성된 SumsungAircon의 powerOff");
		return new FunctionExecution("에어켠을 끄다","에어컨");
	}

}
