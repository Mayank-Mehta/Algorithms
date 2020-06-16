package com.hackerrank.problems;

import java.io.IOException;

public class RepeatedString {
	static long repeatedString(String s, long n) {
		long totalAs = 0L;
		int countInInitialString = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				countInInitialString++;
			}
		}
		
		long multiplyingFactor = n/s.length();
		totalAs = countInInitialString * multiplyingFactor;
		
		int remainder =(int)(n%s.length());
		for(int i=0;i<remainder;i++) {
			if(s.charAt(i)=='a') {
				totalAs++;
			}
		}
		
		return totalAs;

    }
	
	 public static void main(String[] args) throws IOException {
	        long result = repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq", 549382313570L);
	        System.out.println(result);

	     }
	
}
