package com.datastructure.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class AlphabeticallySmallest {
	public static String smallestString(List<String> substrings) {
		if(substrings == null || substrings.size() ==0) {
			return null;
		}
		int size = substrings.size();
		for (int i = 0; i < substrings.size(); i++) {
			for (int j = i + 1; j < size; j++) {
				if ((substrings.get(i) + substrings.get(j)).compareTo(substrings.get(j) + substrings.get(i)) > 0) {
					Collections.swap(substrings, i, j);
				}
			}
		}

		StringBuilder smallestString = new StringBuilder();
		for (int i = 0; i < size; i++) {
			smallestString.append(substrings.get(i));
		}

		return smallestString.toString();

	}

	public static void main(String[] args) {
		List<String> subStrings = new ArrayList<String>();
		subStrings.add("a");
		subStrings.add("bd");
		subStrings.add("ac");
		subStrings.add("cd");
		System.out.println(smallestString(subStrings));
	}
}
