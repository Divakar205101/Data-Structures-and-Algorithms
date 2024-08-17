package com.dsa.arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		System.out.println(solve(nums, 9, 0, nums.length - 1));
	}

	public static int solve(int[] nums, int target, int start, int end) {
		if (start > end)
			return -1;
		int mid = start + (end - start) / 2;
		if (nums[mid] == target)
			return mid;
		else if (target<nums[mid])
			return solve(nums, target, start, mid - 1);
		else
			return solve(nums, target, mid + 1, end);

	}

}
