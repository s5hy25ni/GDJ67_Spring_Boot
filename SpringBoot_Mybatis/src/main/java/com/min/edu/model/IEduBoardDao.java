package com.min.edu.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.min.edu.vo.EduVo;

//TODO 06 interface로 선언된 실행되어지는 Dao
/*
 * 		Edu_Statement.xml의 namespace의 설정에 따라 위치와 클래스명 작성
 * 		@Mapper 선언하여 작성된 interface가 실행되어지는 Dao 선언
 */
@Mapper
public interface IEduBoardDao {

	//TODO 07 작성된 selectBoard의 이름은 Edu_Statement.xml의 id를 사용
	public List<EduVo> selectBoard();
}
