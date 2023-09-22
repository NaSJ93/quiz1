package edu.mit.service;

import org.springframework.stereotype.Service;

import edu.mit.dao.TwoVO;
import edu.mit.logic.MyLogic3;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class QuizService {
	
	private MyLogic3 logic;
	
	//두 수를 모두 더해서 돌려주는 서비스
	public int allsum(TwoVO vo) {
		return logic.addup(vo.getNum1(), vo.getNum2());
	}
}
