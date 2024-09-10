package com.dsa.starproblems;

public class SortColors {

	public static void main(String[] args) {
		int [] nums = {2,0,2,1,1,0};
		optimal(nums);
		for (int i : nums) {
			System.out.println(i);
		}
	}
	
	 public static void sortColors(int[] nums) {
		 sort(nums,0,nums.length-1);
	 }
	 
	 public static void sort(int[] nums,int start,int end) {
		if(start>=end)return;
		int pivot = nums[(start+end)/2];
		int i=start,j=end;
		
		while(i<=j) {
			while(nums[i]<pivot)i++;
			while(nums[j]>pivot)j--;
			if(i<=j) {
				int temp = nums[i];
				nums[i++]=nums[j];
				nums[j--] = temp;
			}
		}
		sort(nums,start,j);
		sort(nums,i,end);
	 }
	 
	 // Dutch National Flag problem
	 // TC : O(n)
	 // SC : O(1)
	 public static void optimal(int[] nums) {
		 int low=0,mid=0,heigh=nums.length-1;
		 while(mid<=heigh) {
			 if (nums[mid]==0) {
				 swap(low,mid,nums); 
				 mid++;
			} else if (nums[mid]==1){
						mid++;
			}else {
				swap(mid,heigh,nums);
				heigh--;
			}
		 }
	 } 
	 
	 public static void swap(int i,int j,int[] nums) {
		 int tem=nums[i];
		 nums[i]=nums[j];
		 nums[j]=tem;
	 }
	 
	
}
