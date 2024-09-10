package com.dsa.lettcodeproblems;

public class MaximumSubarray {

	public static void main(String[] args) {
		int n[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(optimal(n));
	}

	public static void maxSubArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int n = 0;
				for (int k = i; k <= j; k++) {
					n += arr[k];
					max = Math.max(n, max);
				}
			}
		}
	}

	// using Kadane's Algorithm
	public static int optimal(int[] nums) {
		int max = Integer.MIN_VALUE, sum = 0;
		for (int i : nums) {
			sum += i;
			max = Math.max(max, sum);
			if (sum < 0)
				sum = 0;
		}
		return max;
	}

}
