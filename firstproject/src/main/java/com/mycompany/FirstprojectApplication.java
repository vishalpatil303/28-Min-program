package com.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		BinarySortImp b = new BinarySortImp(new QuickSortAlgorithm());
		b.sortAlgorithmMethod(new int[]{12,15,17}, 3);
		SpringApplication.run(FirstprojectApplication.class, args);
	}

}
