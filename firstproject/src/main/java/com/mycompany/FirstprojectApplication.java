package com.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		ApplicationContext ac =		SpringApplication.run(FirstprojectApplication.class, args);
		BinarySortImp b =(BinarySortImp) ac.getBean(BinarySortImp.class);
		b.sortAlgorithmMethod(new int[] {12,13,14,15}, 3);
	}

}
