package com.mycompany;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Qualifier("Bubble")
public class BubbleSortAlgorithm implements SortAlgotrithm
{

	@Override
	public int[] sort(int[] numbers) {
		System.out.println("Bubble Sort Algorithm");
		return numbers;
	}

}
