package com.datastrucutres.sorting;

public class MergeSort {
	private static void split(Integer[] toSplit, Integer[] firstHalf, Integer[] secondHalf) {
		for (int i = 0; i < toSplit.length; i++) {
			if (i < firstHalf.length) {
				firstHalf[i] = toSplit[i];
			} else {
				secondHalf[i - firstHalf.length] = toSplit[i];
			}
		}
		System.out.print("firstHalf:");
		SortingUtil.print( firstHalf);
		System.out.print("secondHalf:");
		SortingUtil.print(secondHalf);
	}

	private static void merge(Integer[] mergeList, Integer[] firstHalf, Integer[] secondHalf) {
		int firstHalfIndex = 0, secondHalfIndex = 0;
		int mergedIndex = 0;
		while ((firstHalfIndex < firstHalf.length) && (secondHalfIndex < secondHalf.length)) {
			if (firstHalf[firstHalfIndex] < secondHalf[secondHalfIndex]) {
				mergeList[mergedIndex++] = firstHalf[firstHalfIndex++];
			} else {
				mergeList[mergedIndex++] = secondHalf[secondHalfIndex++];
			}
		}
		while (firstHalfIndex < firstHalf.length) {
			mergeList[mergedIndex++] = firstHalf[firstHalfIndex++];
		}

		while (secondHalfIndex < secondHalf.length) {
			mergeList[mergedIndex++] = secondHalf[secondHalfIndex++];
		}

	}
	
	public static void mergeSort(Integer[] listToSort) {
		if(listToSort.length == 1) {
			return;
		}
		int midIndex = listToSort.length / 2 + listToSort.length % 2;
		Integer[] firstHalf = new Integer[midIndex]; 
		Integer[] secondHalf = new Integer[listToSort.length-midIndex];
		split(listToSort, firstHalf, secondHalf);
		mergeSort(firstHalf);
		mergeSort(secondHalf);
		merge(listToSort,firstHalf,secondHalf);
		SortingUtil.print(listToSort);
		
	}
	

	public static void main(String[] args) {
		Integer[] data = new Integer[] { 4, 3, 2, 1, 9, 6, 7, 10, 5, 8 };
		Integer[] firstHalf = new Integer[data.length / 2 + data.length % 2];
		Integer[] secondHalf = new Integer[data.length / 2];
		mergeSort(data);
		// split(data,firstHalf,secondHalf);
		/*
		 * data = new Integer[4]; firstHalf = new Integer[] { 1, 4 }; secondHalf = new
		 * Integer[] { 2, 3 }; merge(data, firstHalf, secondHalf);
		 * SortingUtil.print(data);
		 */
		
		
	}

}
