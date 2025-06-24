package com.dsa.starproblems;

public class BinarySubarraysWithSum {

	public static void main(String[] args) {
		int [] nums = {0,0,0,0,0}; int goal = 0;
        System.out.println(optimal(nums,goal) - optimal(nums,goal-1));
	}

	public static int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
        	int s=0;
			  for (int j = i; j < nums.length; j++) {
				   s+=nums[j];
				  
				   if(s>goal)
					   break;
				  
				   count = s==goal ?  count++ : count;
					  
			}
		}
         return count;
	}
	
	public static int optimal(int[] nums, int goal) {
        int left=0,right =0,count = 0,sum=0;
         
        while(right< nums.length) {
        	
        	sum+=nums[right];
        	
        	while (sum>goal && left<=right) {
        		sum-=nums[left++];
			}
        	
        	count += right - left + 1;
        	right++;
        }
        
         return count;
	}

}
