package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSum {

	public static void main(String[] args) {
	  int [] nums = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};		
	 List<List<Integer>> threeSum = threeSum2(nums);
	 for (List<Integer> list : threeSum) {
		  System.out.println(list);
	}
	}
	
	 public static List<List<Integer>> threeSum(int[] nums) {
		 List<List<Integer>> result = new ArrayList<>();
		 for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					if (nums[i]+nums[j]+nums[k]==0) {
						List<Integer> list = new ArrayList<>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						Collections.sort(list);
						if (!result.contains(list)) {
							result.add(list);
						}						
					}
				}
			}
		}
		 return result;
	 }
	 
	 public static List<List<Integer>> threeSum2(int[] nums) {
		 List<List<Integer>> result = new ArrayList<>();
		 Arrays.sort(nums);
		 for (int i = 0; i < nums.length; i++) {
			 if (i>0 && nums[i]==nums[i-1]) continue;
			  int j=i+1;
			  int k=nums.length-1;
			  while (j<k) {
				  int sum = nums[i]+nums[j]+nums[k];
				  if (sum<0) {
					j++;
				} else if (sum>0) {
					k--;
				}else {
					result.add(Arrays.asList(nums[i],nums[j],nums[k]));
					j++;
					k--;
					while (nums[j]==nums[j-1]) j++;
					while (nums[k]==nums[k+1]) k--;
				}			
			  }
           }
		 return result;
	 }
}
