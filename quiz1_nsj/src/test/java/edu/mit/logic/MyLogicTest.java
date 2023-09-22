package edu.mit.logic;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.log4j.Log4j;

@Log4j
public class MyLogicTest {
	
	@Autowired
	MyLogic logic;
	
	@Test
	public void add() {
		log.info("모두 더한 값 : "+logic.addup(1, 10));
	}
	
	@Test
	public void evenadd() {
		log.info("짝수 더한 값 : "+logic.evenAddup(1, 10));
	}
}
