package com.dsa.starproblems;

public class MaxConsecutiveOnesIII {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		System.out.println(longestOnesOp(nums, 2));
	}

	public static int longestOnes(int[] nums, int k) {
		int maxLenght = 0;
		for (int i = 0; i < nums.length; i++) {
			int zeros = 0;
			for (int j = i; j < nums.length; j++) {
				int lenght = 0;
				if (nums[j] == 0) {
					zeros += 1;
				}

				if (zeros > k)
					break;

				maxLenght = Math.max(maxLenght, j - i + 1);
			}
		}
		return maxLenght;
	}

	public static int longestOnesOp(int[] nums, int k) {
		int zero = 0;
		int ans = 0;
		int left = 0, right = 0;
		
		while (left < nums.length && right < nums.length) {
			
			if (nums[right] == 0) 
				zero++;
			

			while (zero > k) {
				if (nums[left] == 0)
					zero--;
				
				left++;
			}

			if (zero <= k) {
				ans = Math.max(ans, (right - left+1));
			}
			right++;

		}
		return ans;
	}

}
