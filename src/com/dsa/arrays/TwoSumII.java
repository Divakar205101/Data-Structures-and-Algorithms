package com.dsa.arrays;

public class TwoSumII {

	public static void main(String[] args) {
		int[] numbers = {-1,0};
		int target = -1;
		int[] twoSum = twoSum(numbers,target);
		for (int i : twoSum) {
			System.out.println(i);
		}
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		int[] ans = new int[2];
		boolean falg = false;
		for(int i=0;i<numbers.length;i++) {
			int j=i+1;			
			while(j<numbers.length) {
				if((numbers[i]+numbers[j])==target) {
					ans[0]=i+1;
					ans[1]=j+1;
					falg = true;
					break;
				}
				j++;
			}
			if(falg!=false)break;
			
		}
		return ans;
	}

}
