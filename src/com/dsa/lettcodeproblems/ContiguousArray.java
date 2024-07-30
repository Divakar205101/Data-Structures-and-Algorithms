package com.dsa.lettcodeproblems;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
	public static void main(String[] args) {
		int[] arr = {1,1,0,0,1,1};
		System.out.println(findMaxLength(arr));
	}
	
	public static int findMaxLength(int[] nums) {
        int res=0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
        	int one=0;
			int zero=0;
			int size = 0;
			for (int j = i; j < nums.length; j++) {
				if (nums[j]==1) {
					one++;
				}else if(nums[j]==0) {
					zero++;
				}
				if (one==zero) {
					size=Math.max(size, j-i+1);
				}
			}
		}
        return res;
    }
}
