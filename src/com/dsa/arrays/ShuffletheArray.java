package com.dsa.arrays;

public class ShuffletheArray {

	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		int[] shuffle = shuffle(nums,3);
		for (int i = 0; i < shuffle.length; i++)
			System.out.print(shuffle[i]+" ");
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] res = new int[nums.length];
		int c=0,j=n;
		for (int i = 0; i <n; i++) {
			res[c++]=nums[i];
			res[c++]=nums[j++];
		}
		return res;
	}

}
