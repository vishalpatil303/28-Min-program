package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySortImp {
	@Autowired
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

	public SortAlgotrithm getSortAlgorithm() {
		return sortAlgorithm;
	}

	//In case of autowired we do not need setter method
	  public void setSortAlgorithm(SortAlgotrithm sortAlgorithm) {
	  this.sortAlgorithm = sortAlgorithm; }
	 

}
