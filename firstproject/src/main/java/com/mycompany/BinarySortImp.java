package com.mycompany;

public class BinarySortImp {

	private SortAlgotrithm sortAlgorithm;

	public BinarySortImp(SortAlgotrithm sortAlgorithm) {
		
		this.sortAlgorithm = sortAlgorithm;
	}

	public void sortAlgorithmMethod(int[] numbers,int number)
	{
		int[] sortAlgorithmOutPut = sortAlgorithm.sort(numbers);
		System.out.println("Binary search is done by " + sortAlgorithm.getClass() );
	}
	

}
