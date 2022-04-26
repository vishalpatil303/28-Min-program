package com.mycompany;

import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgotrithm{

	@Override
	public int[] sort(int[] numbers) {
		System.out.println("Quick Sort Algorithm");
		return numbers;
	}

}
