package com.datastructure.array;

import java.util.ArrayList;
import java.util.List;

public class maxContainers {
	public static void maximumContainers(List<String> scenarios) {
	    if(scenarios == null || scenarios.size() == 0) {
	    	return;
	    }
		for (String scenario : scenarios) {
	    	try {
	    		String[] arry = scenario.split("\\s");
	    		int budget = Integer.parseInt(arry[0]);
	    		int costOfContainer = Integer.parseInt(arry[1]);
	    		int containersToReturn = Integer.parseInt(arry[2]);
	    		int numberOfContainers = budget/costOfContainer;
	    		System.out.println(calculateMaxContainers(numberOfContainers,containersToReturn));
	    	}catch(ArrayIndexOutOfBoundsException e) {
	    		System.out.println("Invalid scenario");
	    	}
		}

	}
	
	
	private static int calculateMaxContainers(int numberOfContainers, int containersToReturn) {
		int totalContainers = numberOfContainers;
		while(numberOfContainers >= containersToReturn) {
			int moreContainers = numberOfContainers/containersToReturn;
			totalContainers = totalContainers + moreContainers;
			numberOfContainers = numberOfContainers%containersToReturn +  moreContainers;
		}
		return totalContainers;
	}


	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("10 2");
		strList.add("12 4 4");
		strList.add("6 2 2");
		maximumContainers(strList);
	}
}
