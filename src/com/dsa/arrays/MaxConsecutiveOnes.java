package com.dsa.arrays;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
     int [] nums = {0,0};
     System.out.println(findMaxConsecutiveOnes(nums));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int res=0, count=0;
		boolean flag = false;
		if(nums.length>1) {
		for (int i = 1; i < nums.length; i++) {
			 	if (nums[i]==1 && nums[i-1]==1  && nums[i-1]==nums[i]) {
			 		count+=1;
			 		flag = true;
				}else {
					if(nums[i]==1 || nums[i-1]==1)count+=1;
					res = Math.max(count, res);
					count = 0;
				}	
		  }
		if(flag)count+=1;
		res = Math.max(count, res);
		}else if(nums.length==1 && nums[0]==1) 	
			res=1;
		return res;
	}

}
