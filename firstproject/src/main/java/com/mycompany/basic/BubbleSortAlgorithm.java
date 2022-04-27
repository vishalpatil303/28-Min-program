package com.mycompany.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Bubble")
public class BubbleSortAlgorithm implements SortAlgotrithm {

	@Override
	public int[] sort(int[] numbers) {
		System.out.println("Bubble Sort Algorithm");
		return numbers;
	}

}
