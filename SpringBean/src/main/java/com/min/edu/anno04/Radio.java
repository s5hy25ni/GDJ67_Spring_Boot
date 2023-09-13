package com.min.edu.anno04;

import org.springframework.stereotype.Component;

/*
 * TODO anno04 04_02 공통 기능을 작성하고 @Component 선언을 통해 Bean으로 동록
 */
@Component
public class Radio implements IFunction {

	@Override
	public void powerOn() {
		System.out.println("라디오를 켜다");
	}

	@Override
	public void powerOff() {
		System.out.println("라디오를 끄다");
	}

}
