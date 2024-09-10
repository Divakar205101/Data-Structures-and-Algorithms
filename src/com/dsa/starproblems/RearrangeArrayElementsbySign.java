package com.dsa.starproblems;

public class RearrangeArrayElementsbySign {

	public static void main(String[] args) {
		int[] nums= {3,1,-2,-5,2,-4};
		int[] rearrangeArray = rearrangeArray(nums);
		for (int i : rearrangeArray) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] rearrangeArray(int[] nums) {
        int [] res = new int[nums.length];
        int p=0,n=1;
        for(int i=0;i<nums.length;i++) {
             if(nums[i]<0) {
            	 res[n]=nums[i];
            	 n+=2;
             }else {
            	 res[p]=nums[i];
            	 p+=2;
             }
        }
        return res;
    }

}
