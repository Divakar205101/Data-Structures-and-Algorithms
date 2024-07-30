package com.dsa.arrays;

public class SearchRotatedArray {

	public static void main(String[] args) {
		int [] nums = {4,5,6,7,0,1,2}; int target = 0;
        System.out.println(search(nums,target));
//         System.out.println(binarySearch(nums,target,0,nums.length));
	}
	
	 public static int search(int[] nums, int target) {
		 System.out.println((0+1)/2);
	       for(int i=0;i<nums.length;i++){
	        if(target==nums[i]) return i;
	       }
	       return -1;
	 }
	 
	 public static int binarySearch(int[] nums, int target,int left,int right) {
		 if(left>right) return -1;
		 int mid = left+right/2;
		 if (nums[mid]==target) {
			return mid;
		}
		if (nums[mid]>target) {
			binarySearch(nums,target,mid,right);
		} else {
			binarySearch(nums,target,left,mid);
		} 
		 return -1;
	 }

}
