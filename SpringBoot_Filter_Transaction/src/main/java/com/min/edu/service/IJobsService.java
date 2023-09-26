package com.min.edu.service;

import java.util.List;
import java.util.Map;

import com.min.edu.vo.JobsVo;

//TODO 07 Controller에서 실행 및 Transaction 조합을 위한 interface 정의
public interface IJobsService {
	// 전체조회
	public List<JobsVo> allSelectJob();

	// 입력
	public int insertJob(Map<String, Object> map);

	// 수정
	public int updateJob();

	// Transaction
	public int transaction(Map<String, Object> map);
}
