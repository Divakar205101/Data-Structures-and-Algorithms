package com.dsa.starproblems;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int [] nums = {1,0,1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int res = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count += 1;
			} else {
				res = Math.max(res, count);
				count = 0;
			}
		}
		res = Math.max(res, count);
		return res;
	}

}
