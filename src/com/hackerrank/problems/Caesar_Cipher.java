package com.hackerrank.problems;

public class Caesar_Cipher {
	static String caesarCipher(String s, int k) {
		String finalString="";
		for(int i=0; i<s.length();i++) {
			char newValue;
			char oldValue = s.charAt(i);
			if(oldValue >=97 && oldValue <=122) {
				newValue = (char)(((oldValue+k-97) % 26) + 97);
			}else if(oldValue >=65 && oldValue <=90){
				newValue = (char)(((oldValue+k-65) % 26) + 65);
			}
			else {
				newValue = oldValue;
			}
			finalString = finalString + newValue;
		}
		return finalString;
    }
	
	public static void main(String[] args) {
		int num = 'Z';
		System.out.println(num);
		System.out.println(caesarCipher("abcZ-", 2));
		
		
	}
}
