package edu.mit.logic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")	
@Log4j
public class MyLogicTest3 {
	
	@Autowired
	MyLogic3 logic;
	
	@Test
	public void add() {
		log.info("모두 더한 값 : "+logic.addup(2, 20));	
		log.info("짝수 더한 값 : "+logic.evenAddup(2, 20));
	}
}
