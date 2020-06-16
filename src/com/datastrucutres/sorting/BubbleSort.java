package com.datastrucutres.sorting;

public class BubbleSort {
	private Integer[] data = new Integer[] {4,3,2,1,9,6,7,10,5,8};
	
	private void sort() {
		
		for(int j=0;j<data.length;j++) {
			boolean swapped = false;
			for(int i=data.length-1;i>j;i--) {
				if(data[i] < data[i-1]) {
					swapped = true;
					SortingUtil.swap(data,i,i-1);
				}
			}
			SortingUtil.print(data);
			if(!swapped) {
				break;
			}
		}
			
		
	}
	
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort();
		SortingUtil.print(bubbleSort.data);
	}
}
