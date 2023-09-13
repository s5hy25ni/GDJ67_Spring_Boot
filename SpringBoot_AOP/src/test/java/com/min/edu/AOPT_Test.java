package com.min.edu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.min.edu.aop06.RightBrain;

@SpringBootTest
class AOPT_Test {
	
	@Autowired
	private RightBrain rightBrain;

	@Test
	@DisplayName("AOP테스트")
	void test() {
		rightBrain.thinking();
	}

}
