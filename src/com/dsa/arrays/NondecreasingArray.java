package com.dsa.arrays;

public class NondecreasingArray {

	public static void main(String[] args) {
		int [] nums = {5,7,1,8};
		System.out.println(checkPossibility2(nums));

	}
	
	 public static boolean checkPossibility(int[] N) {
	        for (int i = 1, err = 0; i < N.length; i++)
	            if (N[i] < N[i-1])
	                if (err++ > 0 || (i > 1 && i < N.length - 1 && N[i-2] > N[i] && N[i+1] < N[i-1]))
	                    return false;
	        return true;
	    }
	 
	 public static boolean checkPossibility2(int[] nums) {
			for (int i=1, modified=0; i<nums.length; i++) {
				if (nums[i-1] > nums[i]) {
					if (modified++ == 1) return false;
					if (i<2 || nums[i-2] <= nums[i]) nums[i-1] = nums[i];
					else nums[i] = nums[i-1];
				}
			}
			return true;
		}
	
	
}
