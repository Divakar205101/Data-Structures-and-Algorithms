package com.dsa.arrays;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int [] nums = {6,5,5};
		System.out.println(optimal(nums));
	}
	
	public static int optimal(int [] nums) {
		int element =-1;
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(count==0) {
				element=nums[i];
				count=1;
			}else {
			if(element==nums[i])
				count++;
			else 
				count--;
			}
		}
		int count1=0;
		for (int i : nums) { 
			if(i==element) count1++;
			if(count1>nums.length/2) return element;
		}	
		
		return count1>nums.length/2 ?  element : -1;
	}
	
	 public static int majorityElement(int[] nums) {
		 Arrays.sort(nums);
		 int ele = nums[0];
		 int count = 1;
		 int res = 0;
		 int item=-1;
		 for (int i = 1; i < nums.length; i++) {
			   if(ele==nums[i]) {
				   count+=1;
			   }else {
				   if(count>nums.length-1) {
					   item = ele;
					   break;
					   
				   }
				   if(res<count) {
					   res = count;
					   item = ele;
				   }
				   count = 1;
				   ele = nums[i];
			   }
		 }
		 if(res<count) {
			   res = count;
			   item = nums[nums.length-1];
		   }
		 return item;
	 }

}
