package com.datastructure.array;

import java.util.List;
import java.util.Optional;

public class FindNumber {
	public static String findNumber(List<Integer> arr, int k) {
		if(arr != null && arr.size() > 0) {
			Optional<Integer> findnumber = arr.stream().filter(number -> number == k).findAny();
			if(findnumber.isPresent()) {
				return "YES";
			}
		}
		return "NO";

	 }
	
	public static void main(String[] args) {
		
	}
}
