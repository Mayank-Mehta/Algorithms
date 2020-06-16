package com.datastructure.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Given two arrays, write a function to compute their intersection.
 */
public class IntersectionOfTwoArrays {
	
	public static int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        Set<Integer> intersectionSet = new HashSet<Integer>();
        Iterator<Integer> iterator = nums1Set.iterator();
        while(iterator.hasNext()) {
        	int value = iterator.next();
        	if(nums2Set.contains(value)) { 
        		intersectionSet.add(value); 
        	} 
        	
        }
		int finalArry[] = new int[intersectionSet.size()];
        int i=0;
        for (int value : intersectionSet) {
			finalArry[i] = value;
			i++;
		}
        return finalArry;
        
    }
	
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6,7};
		int[] nums2 = new int[] {1,2,3,4,5,6,7};
		System.out.println(intersect(nums, nums2));
	}
}
