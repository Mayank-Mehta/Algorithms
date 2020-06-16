package com.datastrucutres.sorting;

public class SelectionSort {
	private Integer[] data = new Integer[] {4,3,2,1,9,6,7,10,5,8};
	
	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		sort.sort();
		SortingUtil.print(sort.data);
	}

	
	private void sort() {
		for (int i=0;i<data.length-1;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i]>data[j]) {
					SortingUtil.swap(data, i,j);
				}
			}
		}
		
	}
}
