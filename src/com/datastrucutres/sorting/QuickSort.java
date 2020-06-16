package com.datastrucutres.sorting;

/*
 * Based on pivot.. all elements less than pivot are on left and more than are on right side.
 */
public class QuickSort {
	private static void partion(int pivot, Integer[] firstHalf, Integer[] secondHalf, Integer[] listToSort ) {
		int firstHalfIndex=0;
		int secondHalfIndex = 0;
		for(int i=0;i<listToSort.length;i++) {
			if(listToSort[i] < pivot) {
				firstHalf[firstHalfIndex++] = listToSort[i];
			}else {
				secondHalf[secondHalfIndex++] = listToSort[i];
			}
		}
	}
	
	public static void sort(Integer[] listToSort) {
		if(listToSort.length==1) {
			return;
		}
		
		int pivot = listToSort[0];
		
	}
}
