package com.dsa.starproblems;

public class CountNumberofNiceSubarrays {

	public static void main(String[] args) {
		int [] nums = {2,2,2,1,2,2,1,2,2,2}; int k = 2;
        System.out.println(optimal(nums,k)-optimal(nums,k-1));
	}

	public static int numberOfSubarrays(int[] nums, int k) {
		int arrcount = 0;
      for (int i = 0; i < nums.length; i++) {
    	   int oddcount =0;
			for (int j = i; j < nums.length; j++) {
				if(nums[j]%2!=0) {
					oddcount++;
				}
				
				if(oddcount>k)
					break;
				
				if(oddcount==k)
					arrcount++;
			}
	}
      return arrcount;
	}
	
	public static int optimal(int[] nums, int goal) {
		
        int left=0,right =0,count = 0,sum=0;
         
        while(right< nums.length) {
        	
        	sum+=nums[right]%2!=0 ? 1 : 0;
        	
        	while (sum>goal && left<=right) {
        		sum-=nums[left++]%2!=0 ? 1 : 0;
			}
        	
        	count += right - left + 1;
        	right++;
        }
        
         return count;
	}

}
