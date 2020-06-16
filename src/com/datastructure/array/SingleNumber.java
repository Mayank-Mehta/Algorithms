package com.datastructure.array;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a non-empty array of integers, every element appears twice except for one. 
 * Find that single one.
 */
public class SingleNumber {
	
	static int findSingleNumber(int[] arry) {
		Set<Integer> uniqueNumber = new HashSet<Integer>();
		for(int i=0; i<arry.length;i++) {
			if(uniqueNumber.contains(arry[i])) {
				uniqueNumber.remove(arry[i]);
			}else {
				uniqueNumber.add(arry[i]);
			}
		}
		return uniqueNumber.iterator().next();
	}
	
	
	public static void main(String[] args) {
			System.out.println(findSingleNumber(new int[] {4,1,2,1,2}));
		}
}
