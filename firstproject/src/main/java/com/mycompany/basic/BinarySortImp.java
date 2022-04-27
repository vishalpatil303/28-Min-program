package com.mycompany.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySortImp {

	@Autowired
	@Qualifier("Quick")
	private SortAlgotrithm sortAlgorithm;

	public BinarySortImp(SortAlgotrithm sortAlgorithm) {

		this.sortAlgorithm = sortAlgorithm;
	}

	@PostConstruct
	public void postConstructMsg() {
		System.out.println("Massage from post construct method");
	}
	
	@PreDestroy
	public void preDestoryMsg()
	{
		System.out.println("Massage from Pre Destory Method");
	}
	public void sortAlgorithmMethod(int[] numbers, int number) {
		int[] sortAlgorithmOutPut = sortAlgorithm.sort(numbers);
		System.out.println("Binary search is done by " + sortAlgorithm.getClass());
	}

}
