package com.datastructure.array;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {
	public static List<Integer> oddNumbers(int l, int r) {
		List<Integer> oddNumbers = new ArrayList<Integer>();
		if (l > r) {
			return null;
		}
		for (int i = l; i <= r; i++) {
				if (i % 2 == 1) {
					oddNumbers.add(i);
				}
			}
		return oddNumbers;
	}
}
