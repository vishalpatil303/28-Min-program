package com.mycompany;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgotrithm
{

	@Override
	public int[] sort(int[] numbers) {
		System.out.println("Bubble Sort Algorithm");
		return numbers;
	}

}
