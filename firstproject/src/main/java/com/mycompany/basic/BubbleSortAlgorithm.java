package com.mycompany.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Bubble")

public class BubbleSortAlgorithm implements SortAlgotrithm
{

	public BubbleSortAlgorithm()
	{
		System.out.println("Bubble Sort Algorithm");
	}
	@Override
	public int[] sort(int[] numbers) {
		System.out.println("Bubble Sort Algorithm");
		return numbers;
	}

}
