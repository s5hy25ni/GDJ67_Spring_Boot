package com.min.edu;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.min.edu.model.IEduBoardDao;
import com.min.edu.vo.EduVo;

@SpringBootTest
class SpringBootMybatisApplicationTests {

	//TODO 08 작성된 myBatis를 실행해서 결과 확인
	@Autowired
	private IEduBoardDao mapper;
	
	@Test
	public void myBatis_SelectTest() {
		List<EduVo> lists = mapper.selectBoard();
		System.out.println("결과 : "+lists);
	}

}
