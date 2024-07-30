package com.dsa.arrays;

import java.util.Arrays;

public class ThreeSumClosest {
	

	public static void main(String[] args) {
		int[] nums = { -1,2,1,-4};
		System.out.println(threeSumClosest(nums, 1));
	}

	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int closestsum = nums[0] + nums[1] + nums[2];
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1, k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == target)
					return target;
				if (Math.abs(target - sum) < Math.abs(target - closestsum))
					closestsum = sum;
				if (sum < target)
					j++;
				else
					k--;

			}
		}
		return closestsum;
	}
}
