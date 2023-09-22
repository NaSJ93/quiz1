package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.mit.dao.TwoVO;
import edu.mit.service.QuizService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@AllArgsConstructor
public class QuizController {
	
	private QuizService service;
	
	@GetMapping("/quiz/quiz1")
	public void quiz(Model model) {
		model.addAttribute("quiz", "오늘은 금요일");		
	}
	
	@GetMapping("/quiz/quiz2")
	public void quiz2() {
		log.info("get요청");
	}
	
	@PostMapping("/quiz/quiz2")
	public String quiz2p(TwoVO vo, Model model) {
		log.info("post 요청");
		log.info(vo);
		
		model.addAttribute("sum", service.allsum(vo));
		return "/quiz/result";
	}
	
}
