package com.leetcode.problem.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchSuggestion {
	public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
		List<List<String>> suggestionsList = new ArrayList<List<String>>();
		List<String> productList = Arrays.asList(products);
        Collections.sort(productList);
        for (int i=1; i<=searchWord.length(); i++) {
			List<String> suggestsListPerWord = new ArrayList<String>();
        	String wordToSearch = searchWord.substring(0,i);
			for (String product : productList) {
				if(product.startsWith(wordToSearch)) {
					suggestsListPerWord.add(product);
					if(suggestsListPerWord.size() == 3) {
						break;
					}
				}
			}
			suggestionsList.add(suggestsListPerWord);
		}
        return suggestionsList;
    }
	
	public static void main(String[] args) {
		String[] products = new String[] {"bags","baggage","banner","box","cloths"}; 
		String searchWord = "d";
		System.out.println(suggestedProducts(products, searchWord));
	}
}
