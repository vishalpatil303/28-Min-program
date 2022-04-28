package com.mycompany.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Qualifier("Bubble")
public class BubbleSortAlgorithm implements SortAlgotrithm
{

	public BubbleSortAlgorithm()
	{
		System.out.println("Bubble Sort Algorithm Constructor");
	}
	@Override
	public int[] sort(int[] numbers) {
		System.out.println("Bubble Sort Algorithm");
		return numbers;
	}
	@PostConstruct
	public void postConstruct()
	{
		System.out.println("Bubble Sort Algorithm post construct method");
	}
	@PreDestroy
	public void preDestory()
	{
		System.out.println("Bubble Sort Algorithm pre Distory construct method");
	}

}
