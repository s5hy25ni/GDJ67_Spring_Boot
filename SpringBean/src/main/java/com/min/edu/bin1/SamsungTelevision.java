package com.min.edu.bin1;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SamsungTelevision implements RomoteController {

	@Override
	public FunctionExecution powerOn() {
		log.info("@Componet로 생성된 SamsungTelevision의 powerOn");
		return new FunctionExecution("텔레비전을 켜다", "텔레비전");
	}

	@Override
	public FunctionExecution powerOff() {
		log.info("@Componet로 생성된 SamsungTelevision의 powerOff");
		return new FunctionExecution("텔레비전을 끄다", "텔레비전");
	}

}
