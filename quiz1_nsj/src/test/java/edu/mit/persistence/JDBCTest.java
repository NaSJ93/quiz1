package edu.mit.persistence;


import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {
	
	@Test
	public void testConnection()  {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "aaa", "1234");
				log.info("접속성공");				
			} catch (Exception e) {
				log.info("접속실패");				
				e.printStackTrace();				
			}
	}	

}
