package com.dsa.starproblems;

public class SumofSubarrayRanges {

	public static void main(String[] args) {
		int [] nums = {4,-2,-3,4,1};
        System.out.println(subArrayRanges(nums));
	}
	
	 public static long subArrayRanges(int[] nums) {
		long sum = 0;
		
		
	      for (int i = 0; i < nums.length; i++) {
	    	  
	    	  int min = nums[i];
	    	  int max = nums[i];
				
	    	    for (int j = i; j < nums.length; j++) {
	    	    	
	    	    	
	    	    		min = Math.min(min, nums[j]);
	    	    	
	    	    	
	    	    	
						max =  Math.max(max, nums[j]);
	    	    	
	    	    	 sum +=max-min;
	    	    }

		    }
	      
	      return sum;
	 }
	 
	 
	 
	 

}
