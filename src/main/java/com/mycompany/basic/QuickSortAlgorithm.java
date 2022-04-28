package com.mycompany.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Qualifier("Quick")
public class QuickSortAlgorithm implements SortAlgotrithm{

	public QuickSortAlgorithm()
	{
		System.out.println("Quick Sort Algorithm Constructor");
	}
	@Override
	public int[] sort(int[] numbers) {
		System.out.println("Quick Sort Algorithm");
		return numbers;
	}

	@PostConstruct
	public void postConstruct()
	{
		System.out.println("Quick Sort Algorithm post construct method");
	}
	@PreDestroy
	public void preDestory()
	{
		System.out.println("Quick Sort Algorithm pre Distory construct method");
	}
}
