package com.datastructure.array;
/*
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {
	public static void rotate(int[] nums, int k) {
        int length = nums.length;
        int i=0;
        int temp1 = nums[i];
        do {
        	int evaluatingPosition = (i+k) % length;
        	int temp = nums[evaluatingPosition];
        	nums[evaluatingPosition] = temp1;
        	i=evaluatingPosition;
        	temp1 = temp;
        }while(i!=0);
        for (int j = 0; j < nums.length; j++) {
			System.out.println(nums[j]);
		}
    }
	
	public static void rotate1(int[] nums, int k) {
		int[] newArry = new int[nums.length];
		for (int i=0;i<nums.length;i++) {
			int evaluatingPosition = (i+k) % nums.length;
			newArry[evaluatingPosition] = nums[i];
		}
		
		for (int j = 0; j < nums.length; j++) {
			nums[j] = newArry[j];
		}
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6,7};
		rotate1(nums,3);
	}
}
