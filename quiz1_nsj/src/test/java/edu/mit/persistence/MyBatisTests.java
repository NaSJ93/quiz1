package edu.mit.persistence;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MyBatisTests {

		private SqlSessionFactory sqlSessionFactory;
		
		@Test
		public void testMyBatis() {
		 SqlSession session = sqlSessionFactory.openSession();
		 session.getConnection();
		}
}
