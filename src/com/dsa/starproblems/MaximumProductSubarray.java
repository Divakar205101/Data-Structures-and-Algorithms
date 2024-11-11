package com.dsa.starproblems;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		int [] nums = {2,3,-2,4};
		int maxProduct = maxProduct1(nums);
		System.out.println(maxProduct);
	}
	
	 public static int maxProduct(int[] nums) {
		 if(nums.length==1)return nums[0];
		 int res=0;
		 int max = Integer.MIN_VALUE;
		 for (int i = 0; i < nums.length; i++) {
			 res=nums[i];
			 max = Math.max(res, max);
			for (int j = i+1; j <nums.length; j++) {
				res = res * nums[j];
				max = Math.max(res, max);
			}
		}
		 return max;
	 }
	 
	 public static int optimal(int[] nums) {
		 long prefix=1,sufix=1;int max = Integer.MIN_VALUE;
		 for(int i=0;i<nums.length;i++) {
			 if(prefix==0)prefix=1; 
			 if(sufix==0)sufix=1;
			 prefix *=nums[i];
			 sufix *=nums[nums.length-i-1];
			 max = (int) Math.max(max, Math.max(prefix, sufix));
		 }
		 return max;
	 }
	
	 public static  int maxProduct1(int[] nums) {
	        
	        int max = nums[0], min = nums[0], ans = nums[0];
	        
	        for (int i = 1; i < nums.length; i++) {
	            
	            int temp = max;  // store the max because before updating min your max will already be updated
	            
	            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
	            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
	            
	            if (max > ans) {
	                ans = max;
	            }
	        }
	        
	        return ans;

	    }

}
