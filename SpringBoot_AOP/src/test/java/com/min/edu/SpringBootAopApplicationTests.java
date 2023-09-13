package com.min.edu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.min.edu.aop.Man;
import com.min.edu.aop.Woman;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class SpringBootAopApplicationTests {

	@Autowired
	private Man man;
	
	@Autowired
	private Woman woman;
	
	@Test
	@DisplayName("AOP테스트")
	void contextLoads() {
		man.classWork();
		woman.classWork();
	}

}
