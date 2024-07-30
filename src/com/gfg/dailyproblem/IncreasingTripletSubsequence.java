package com.gfg.dailyproblem;

public class IncreasingTripletSubsequence {

	public static void main(String[] args) {
		int[] nums = {1,2,2,1};
	 System.out.println(solve(nums));	

	}
	
	public boolean increasingTriplet(int[] nums) {
        int left = Integer.MAX_VALUE;
        int  right = Integer.MAX_VALUE;
        for(int n : nums){
            if(n<=left)  left =n;
              else if(n <=right) right = n;
              else return true;
        }
         
         return false;
}
	
    public static  boolean solve(int[] nums) {
    	int length = nums.length;
	  for (int i = 0; i < length-2; i++) {
		for (int j = 0; j < length-1; j++) {
			for (int j2 = 0; j2 < length; j2++) {
				if ((nums[i]<nums[j]) && (nums[j]<nums[j2])) {
					return true;
				}
			}
		}
	}
	  return false;
	}
  
}
