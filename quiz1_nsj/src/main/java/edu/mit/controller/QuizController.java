package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.mit.dao.TwoVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class QuizController {
	
	@GetMapping("/quiz/quiz1")
	public void quiz(Model model) {
		model.addAttribute("quiz", "오늘은 금요일");		
	}
	
	@GetMapping("/quiz/quiz2")
	public void quiz2() {
		log.info("get요청");
	}
	
	@PostMapping("/quiz/quiz2")
	public void quiz2p(TwoVO vo) {
		log.info("post 요청");
		log.info(vo);
	}
	
}
