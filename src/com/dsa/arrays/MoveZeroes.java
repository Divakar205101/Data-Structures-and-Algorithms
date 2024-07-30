package com.dsa.arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] num = {0,1,0,3,12};
		moveZeroes(num);
	}
	
	public static  void moveZeroes(int[] nums) {
		if (nums.length!=1) {
			
        for (int i = 0; i < nums.length; i++) {
			   if (nums[i]==0 && i<nums.length-1 && nums[i+1]!=0 ) {
				    int temp = nums[i+1];
				    nums[i] = temp;
				    nums[i+1] = 0;
			} else {
				int j=i;
                  while (j<nums.length) {
					  if (nums[j]!=0) {
						   int t = nums[j];
						   nums[j] = 0;
						   nums[i] =t;
						   break;
					  }else {
						  j++;
					  }
				}
			}
		}
        
        for (int i : nums) {
			System.out.println(i);
		}
    }
	}
	
	public void name(int[] nums) {
		int j=0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=0) {
				int t=nums[i];
				nums[i]=nums[j];
				nums[j]=t;
				j++;
			}
		}
	}
}
