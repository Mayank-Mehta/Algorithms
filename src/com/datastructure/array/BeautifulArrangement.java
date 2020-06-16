package com.datastructure.array;

public class BeautifulArrangement {
	static int count = 0;
	static int arrangements(int n) {
		int[] numbers = new int[n];
        for (int i = 1; i <= n; i++)
            numbers[i - 1] = i;
        findPermutations(numbers, 0);
        return count;

    }
	
	public static void findPermutations(int[] nums, int l) {
        if (l == nums.length) {
            count++;
        }
        for (int i = l; i < nums.length; i++) {
            swap(nums, i, l);
            if (nums[l] % (l + 1) == 0 || (l + 1) % nums[l] == 0)
            	findPermutations(nums, l + 1);
            swap(nums, i, l);
        }
    }
	
	public static void swap(int[] number, int x, int y) {
        int temp = number[x];
        number[x] = number[y];
        number[y] = temp;
    }
	
	public static void main(String[] args) {
		System.out.println(arrangements(2));
	}
}
