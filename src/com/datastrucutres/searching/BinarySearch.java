package com.datastrucutres.searching;

public class BinarySearch {
	
	public int search(Integer[] data, int valueToSearch) {
		
		int startIndex = 0; 
		int endIndex = data.length-1;
		
		while(endIndex >= startIndex) {
			int mid = (startIndex+endIndex)/2;
			if(valueToSearch == data[mid]) {
				return mid;
			}else if(data[mid] > valueToSearch) {
				endIndex = mid-1;
			}else {
				startIndex = mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Integer[] data = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		BinarySearch search = new BinarySearch();
		System.out.println(search.search(data, 10));
	}
}
