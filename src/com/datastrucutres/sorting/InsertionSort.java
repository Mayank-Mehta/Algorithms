package com.datastrucutres.sorting;

public class InsertionSort {
private Integer[] data = new Integer[] {4,3,2,1,9,6,7,10,5,8};
	
public void sort(Integer[] data) {
	for(int i=0;i<data.length-1;i++) {
		for(int j=i+1;j>0;j--) {
			if(data[j] < data[j-1]) {
				SortingUtil.swap(data, j, j-1);
			}else {
				break;
			}
		}
		SortingUtil.print(data);
	}
	
	
}	

public void sort2(Integer[] data) {
		int index = 0;
		while(index < data.length-1) {
				int temp = index;
				while(temp >= 0) {
					if(data[temp] > data[temp+1]) {
						SortingUtil.swap(data, temp, temp+1);
						temp --;
					}
					else {
						break;
					}
				}
			index++;	
			SortingUtil.print(data);
		}
	}
	
	
	
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		sort.sort2(sort.data);
		SortingUtil.print(sort.data);
	}
}
