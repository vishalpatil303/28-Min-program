package com.mycompany;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mycompany.scope.PersonDao;

@SpringBootApplication
public class ScopeProjectApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ScopeProjectApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext ac =  SpringApplication.run(ScopeProjectApplication.class, args);
		PersonDao p1 = ac.getBean(PersonDao.class);
		PersonDao p2 = ac.getBean(PersonDao.class);
		LOGGER.info("{}",p1);
		LOGGER.info("{}",p1.getJdbcConnection());
		
		LOGGER.info("{}",p2);
		LOGGER.info("{}",p2.getJdbcConnection());
	}

}
