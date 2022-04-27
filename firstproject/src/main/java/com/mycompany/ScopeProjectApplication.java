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

		ApplicationContext ac = SpringApplication.run(ScopeProjectApplication.class, args);
		PersonDao b1 =ac.getBean(PersonDao.class);
		PersonDao b2 =ac.getBean(PersonDao.class);
		LOGGER.info("{}",b1);
		LOGGER.info("{}",b1.getJdbcConnection());
		
		LOGGER.info("{}",b2);
		LOGGER.info("{}",b2.getJdbcConnection());

	}

}
