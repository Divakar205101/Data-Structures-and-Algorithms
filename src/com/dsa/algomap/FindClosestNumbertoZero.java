package com.dsa.algomap;

public class FindClosestNumbertoZero {

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 1, 1, -1, 100000 };
		System.out.println(findClosestNumber(nums));
	}

	public static int findClosestNumber(int[] nums) {
		int res = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (Math.abs(res) >= Math.abs(nums[i]) && Math.abs(nums[i]) != res) {

				res = nums[i];

			}
		}
		return res;
	}

}
