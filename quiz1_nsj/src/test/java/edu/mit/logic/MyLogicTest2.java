package edu.mit.logic;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class MyLogicTest2 {
	
	MyLogic2 logic=new MyLogic2();
	
	@Test
	public void add() {
		log.info("모두 더한 값 : "+logic.addup(2, 20));
	}
	
	@Test
	public void addeven() {
		log.info("짝수 더한 값 : "+logic.evenAddup(2, 20));
	}
}
