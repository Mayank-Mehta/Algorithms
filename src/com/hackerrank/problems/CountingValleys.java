package com.hackerrank.problems;

import java.io.IOException;

public class CountingValleys {
	 static int countingValley(int n, String s) {
		 int noOfValleys = 0;
		 int total = 0;
		 for(int i=0;i<n;i++) {
			 char charAtPoint = s.charAt(i);
			 if(charAtPoint == 'U') {
				 total++;
			 }else {
				 total--;
			 }
			 if(charAtPoint == 'U' && total==0) {
				 noOfValleys++;
			 }
		 }
		 return noOfValleys;

	  }
	 
	 public static void main(String[] args) throws IOException {
	        String ar[] = new String[] {"U","D","D","D","U","D","U","U"};
	        int result = countingValley(8, "UDDDUDUU");
	        System.out.println(result);

	     }
}
