package com.mycompany;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mycompany.basic.BinarySortImp;

@SpringBootApplication
public class BasicProjectApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(BasicProjectApplication.class);

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(BasicProjectApplication.class, args);
		BinarySortImp b =ac.getBean(BinarySortImp.class);
		b.sortAlgorithmMethod(new int[] {12,16,18,17}, 5);

	}

}
