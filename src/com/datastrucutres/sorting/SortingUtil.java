package com.datastrucutres.sorting;

public class SortingUtil {
	public static void swap(Integer[] data, int iIndex, int jIndex) {
		int temp = data[iIndex];
		data[iIndex] = data[jIndex];
		data[jIndex] = temp;
	}
	
	public static void print(Integer[] data) {
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+",");
			
		}
		System.out.println();
	}
	
}
