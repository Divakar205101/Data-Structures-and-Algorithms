package com.dsa.starproblems;

public class Longestconsecutivesubsequence {

	public static void main(String[] args) {
		int[] nums = { 1, 9, 3, 10, 4, 20, 2 };
		int n = 7;
		System.out.println(findLongestConseqSubseq(nums, nums.length));
	}

	static int findLongestConseqSubseq(int arr[], int N) {
		sort(0, arr.length - 1, arr);
		int res = 0;
		int c = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] == 1) {
				c++;
			} else if (arr[i + 1] - arr[i] == 0) {
				continue;
			} else {
				res = Math.max(res, c);
				c = 0;
			}
		}
		res = Math.max(res, c);
		return res + 1;

	}

	public static void sort(int start, int end, int[] nums) {
		if (start > end)
			return;
		int i = start;
		int j = end;
		int pivot = nums[(start + end) / 2];
		while (i <= j) {
			while (nums[i] < pivot)
				i++;
			while (nums[j] > pivot)
				j--;
			if (i <= j) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j--;
			}
		}
		sort(start, j, nums);
		sort(i, end, nums);
	}

}
