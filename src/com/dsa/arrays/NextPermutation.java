package com.dsa.arrays;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		nextPermutation(nums);
		Arrays.stream(nums).forEach(System.out :: print);
	}
	
	public static  void nextPermutation(int[] nums) {
        int index1=-1;
        int index2=-1;
        for(int i=nums.length-2;i>=0;i++) {
        	if(nums[i]<nums[i+1]) {
        		index1=i;
        		break;
        	}
        }
        
        if(index1==-1) {
        	
        }else {
        	for(int j=nums.length-1;j>=0;j--) {
        		if(nums[j]>nums[index1]) {
        			index2 = j;
        			break;
        		}
        	}
        	swap(nums,index1,index2);
        	reverse(nums,index1+1);
        }
        
    }
	
	public static void reverse(int [] nums,int start) {
		int i=start;
		int j=nums.length-1;
		while(i<j) {
			int temp = nums[i];
			nums[i] =nums[j];
			nums[j]=temp;
		}
	}
	
	public static  void swap(int [] nums,int start,int end) {
		int temp = nums[start];
		nums[start]=nums[end];
		nums[end]=temp;
	}

}
