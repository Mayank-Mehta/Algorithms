package com.leetcode.problem.string;

public class BalancedString {
	public static int balancedStringSplit(String s) {
		int count = 0;
		if(s == null || s.length() == 0) {
			return count;
		}
		char[] charArray = s.toCharArray();
		int sum = 0;
		for (char c : charArray) {
			if(c == 'L') {
				sum --;
			}
			if(c == 'R') {
				sum ++;
			}
			
			if(sum == 0) {
				count++;
			}
		}
		return count;
    }
	
	public static void main(String[] args) {
		System.out.println(balancedStringSplit("RLRRLLRLRL"));
		System.out.println(balancedStringSplit("RLLLLRRRLR"));
		System.out.println(balancedStringSplit("LLLLRRRR"));
		System.out.println(balancedStringSplit("RLRRRLLRLL"));
	}
}
