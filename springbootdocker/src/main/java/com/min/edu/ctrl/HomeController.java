package com.min.edu.ctrl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	
	@GetMapping(value="/")
	public String home() throws UnsupportedEncodingException {
		log.info("HomeController 처음 호출되는 요청");
		/*
		 * spring의 redirect를 통한 한글 전달시 인코딩 문제 발생
		 * 따라서 URLEncoder를 통해서 UTF-8로 인식하도록 해줘야 한다.
		 */
		String name = URLEncoder.encode("한글", "UTF-8");
		return "redirect:/info.do?name="+name+"&age=100";
	}
	
	@GetMapping(value="/info.do")
	public String info(String name, int age, Model model) {
		log.info("info.do 전달 받은 파라미터 : {}, {}", name, age);
		model.addAttribute("infoname",name);
		model.addAttribute("infoage",age);
		return "info";
	}
}
