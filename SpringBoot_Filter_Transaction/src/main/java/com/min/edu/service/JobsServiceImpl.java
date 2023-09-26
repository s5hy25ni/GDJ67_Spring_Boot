package com.min.edu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.min.edu.mapper.IJobsMapper;
import com.min.edu.vo.JobsVo;

import lombok.extern.slf4j.Slf4j;

//TODO 08 interface가 구현된 Service 클래스 @Transaction 처리
@Service
@Slf4j
public class JobsServiceImpl implements IJobsService {

	@Autowired
	private IJobsMapper dao;
	
	@Override
	public List<JobsVo> allSelectJob() {
		log.info("JobsServiceImpl : Jobs 테이블 전체 조회 allSelectJob");
		return dao.allSelectJob();
	}

	@Override
	public int insertJob(Map<String, Object> map) {
		log.info("JobsServiceImpl : Jobs 테이블 입력 insertJob - {}", map);
		return dao.insertJob(map);
	}

	@Override
	public int updateJob() {
		log.info("JobsServiceImpl : Jobs 테이블 USEAGE 컬럼 N으로 재입력 updateJob");
		return dao.updateJob();
	}

	//TODO 15 @Transaction을 통한 method의 Transaction 설정
	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int transaction(Map<String, Object> map) {
		log.info("JobsServiceImpl : transaction update 실행");
		int m = dao.updateJob();
		log.info("JobsServiceImpl : transaction insert 실행 - {}", map);
		int n = dao.insertJob(map);
		return (m>0||n>0)?1:0;
	}

}
