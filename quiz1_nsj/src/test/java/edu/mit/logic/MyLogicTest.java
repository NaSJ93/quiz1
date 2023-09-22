package edu.mit.logic;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class MyLogicTest {
	
	@Test
	public void add() {
		log.info("모두 더한 값 : "+MyLogic.addup(1, 10));
	}
	
	@Test
	public void addeven() {
		log.info("짝수 더한 값 : "+MyLogic.evenAddup(1, 0));
	}
}
