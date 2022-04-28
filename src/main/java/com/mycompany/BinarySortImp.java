package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qulifer("BinarySortImp")
public class BinarySortImp {

	@Autowired
	@Qualifier("Bubble")
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
