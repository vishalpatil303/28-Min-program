package com.mycompany;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Qualifier("Quick")
public class QuickSortAlgorithm implements SortAlgotrithm{

	@Override
	public int[] sort(int[] numbers) {
		System.out.println("Quick Sort Algorithm");
		return numbers;
	}

}
