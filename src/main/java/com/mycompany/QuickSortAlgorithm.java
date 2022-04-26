package com.mycompany;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Quick")
public class QuickSortAlgorithm implements SortAlgotrithm{

	@Override
	public int[] sort(int[] numbers) {
		System.out.println("Quick Sort Algorithm");
		return numbers;
	}

}
