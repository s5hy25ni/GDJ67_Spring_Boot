package com.min.edu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.min.edu.model.IEduBoardDao;
import com.min.edu.vo.EduVo;
import lombok.extern.slf4j.Slf4j;
@Controller
@Slf4j
public class EduBoardController {
	
	@Autowired
	private IEduBoardDao dao;
	
	@GetMapping(value = "/")
	public String home() {
		log.info("처음 호출되는 요청");
		return "redirect:/boardList.do";
	};
	
	@GetMapping(value = "/boardList.do")
	public String boardList(Model model) {
		log.info("EduBoard 전체글 조회");
		List<EduVo> lists = dao.selectBoard();
		model.addAttribute("lists",lists);
		return "boardList";
	}
}