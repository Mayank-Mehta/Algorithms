package com.hackerrank.problems;

public class FebonacciSeries {
	public static int findFebonacciNumber(int position) {
		if(position <= 1) {
			return 1; 
		}
		return findFebonacciNumber(position -1) + findFebonacciNumber(position-2);
		
	}
	
	public static void main(String[] args) {
		System.out.println(findFebonacciNumber(9));
	}
}
