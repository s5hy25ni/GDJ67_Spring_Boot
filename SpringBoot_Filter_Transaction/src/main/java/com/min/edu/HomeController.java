package com.min.edu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.min.edu.service.IJobsService;
import com.min.edu.vo.JobsVo;

import lombok.extern.slf4j.Slf4j;

//TODO 09 Controller 화면에서 요청 처리

@Controller
@Slf4j
public class HomeController {

	@Autowired
	private IJobsService service;
	
	@GetMapping(value="/")
	public String welcomePage() {
		log.info("HomeController welcomePage");
		return "intro";
	}
	
	@GetMapping(value="/selectJobs.do")
	public String select(Model model) {
		log.info("HomeController 전체 조회 Select");
		List<JobsVo> lists = service.allSelectJob();
		model.addAttribute("selectresult",lists);
		return "result";
	}
	
	@PostMapping(value="/insertJobs.do")
	public String insert(@RequestParam Map<String, Object> map, Model model) {
		log.info("HomeController 입력 insert, form 값 {}", map);
		int cnt = service.insertJob(map);
		model.addAttribute("insertresult", cnt);
		return "result";
	}
	
	@GetMapping(value="/updateJobs.do")
	public String update(Model model) {
		log.info("HomeController 수정 update");
		int cnt = service.updateJob();
		model.addAttribute("updateresult", cnt);
		return "result";
	}
	
	@GetMapping(value="/transaction.do")
	public String transaction(Model model) {
		log.info("HomeController 트랜잭션 transaction");
		int cnt = service.transaction(new HashMap<String, Object>());
		model.addAttribute("transaction", cnt);
		return "result";
	}
	
	@GetMapping(value="/error")
	public String errorHandlerMapping(HttpServletRequest request) {
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		if(status != null) {
			return "404";
		} else {
			return "other";
		}
	}
}
