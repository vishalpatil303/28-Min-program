package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("Prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

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
