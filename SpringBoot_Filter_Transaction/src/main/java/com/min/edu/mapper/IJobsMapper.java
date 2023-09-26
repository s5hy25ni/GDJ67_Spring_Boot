package com.min.edu.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.min.edu.vo.JobsVo;

//TODO 06 myBatis 가 실행되는 Mapper 선언
@Mapper
public interface IJobsMapper {
	//전체조회
	public List<JobsVo> allSelectJob();
	
	//입력
	public int insertJob(Map<String, Object> map);
	
	//수정
	public int updateJob();
}
