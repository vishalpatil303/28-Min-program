package com.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mycompany.basic.BinarySortImp;
import com.mycompany.basic.QuickSortAlgorithm;

@SpringBootApplication
public class BasicProjectApplication {

	public static void main(String[] args) {
		
		ApplicationContext ac = SpringApplication.run(BasicProjectApplication.class, args);
		BinarySortImp b = ac.getBean(BinarySortImp.class);
		b.sortAlgorithmMethod(new int[] {112,13,14,15}, 3);
	}

}
