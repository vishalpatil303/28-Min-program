package com.mycompany.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySortImp {

	@Autowired
	@Qualifier("Quick")
	private SortAlgotrithm sortAlgorithm;
	/*
	 * public BinarySortImp(SortAlgotrithm sortAlgorithm) {
	 * 
	 * this.sortAlgorithm = sortAlgorithm; }
	 */

	public void sortAlgorithmMethod(int[] numbers,int number)
	{
		int[] sortAlgorithmOutPut = sortAlgorithm.sort(numbers);
		System.out.println("Binary search is done by " + sortAlgorithm.getClass() );
	}
	

}
