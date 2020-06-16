package com.hackerrank.problems;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockProblem {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
             Map<Integer, Integer> sockColorMap = new HashMap<Integer,Integer>();
             for(int i=0; i < ar.length; i++){
                Integer color = sockColorMap.get(ar[i]);
				if(color == null) {
                	 sockColorMap.put(ar[i], 0);
                }
                sockColorMap.put(ar[i], sockColorMap.get(ar[i])+1);
             }
             int count = 0;
             for (Integer color : sockColorMap.keySet()) {
            	 System.out.println(color + "," + sockColorMap.get(color));
            	 count = count + sockColorMap.get(color)/2;
             }
             
             return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int ar[] = new int[] {10,20, 20, 10, 10, 30, 50, 10, 20};
        int result = sockMerchant(9, ar);
        System.out.println(result);

     }
}
