package com.dsa.starproblems;

public class FindDuplicateElements {

	public static void main(String[] args) {
		int [] arr = {1,3,4,2,2};
		System.out.println(findDuplicate(arr));

	}
	
	 public static int findDuplicate(int[] nums) {
		 int n=0;
//		 int slow = nums[0];
//		 int fast = nums[0];
//		 
//		 do {
//			 slow = nums[slow];
//			 fast = nums[nums[fast]];
//		} while (slow!=fast);
//		 
//		 slow = nums[0];
//		 
//		while (slow!=fast);{
//			 slow = nums[slow];
//			 fast = nums[fast];
//		}
//		 
//		 return slow;
		 
		 int [] arr = new int[nums.length];
		 
		 for (int i : nums) {
			 
			 if(arr[i]!=0) {
				 n= i;
				 break;
			 }
			 
			 arr[i] = 1;
			
		}
		 return n;
		 
	 }

}
