package edu.mit.dao;

import java.util.Date;

public interface QuizMapper {
	Date now();
	
	void save(TwoVO vo);
}
