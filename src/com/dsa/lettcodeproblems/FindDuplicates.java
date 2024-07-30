package com.dsa.lettcodeproblems;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] nums = {2,1,2};
         System.out.println(findDuplicate(nums));
	}
	
	public static int findDuplicate(int[] nums) {
		List<Integer> l = new ArrayList<>();
		int r=0;
		int start = 0;
		int end = nums.length-1;
		while (start<=end) {
			if(nums[start]==nums[end]) {
				 return nums[start];
			}else if(l.contains(nums[start])) {
				return nums[start];
			}else if (l.contains(nums[end])) {
				  return nums[end];
			}else {
				l.add(nums[start++]);
				l.add(nums[end--]);
			}
		}
		return r;
	}

}
