package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllPermutations {
	

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		List<List<Integer>> solve = solve(nums);
		for (List<Integer> list : solve) {
			System.out.println(list);
		}
	}
	
	public static List<List<Integer>> solve(int []nums){
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> dis = new ArrayList<>();
		 boolean[] b = new  boolean[nums.length];
		 optimal(nums,0,arr);
		return arr;
	}
	
	public static void permuation(int[] nums,List<Integer> arr,List<List<Integer>> res,boolean[] flag){
		if(flag.length==arr.size()) {
			res.add(new ArrayList<>(arr));
			return;
		}
		for(int i=0;i<nums.length;i++) {
			if(!flag[i]) {
				flag[i] =true;
				arr.add(nums[i]);
				permuation(nums,arr,res,flag);
				flag[i] =false;
				arr.remove(arr.size()-1);
				
			}
		}
	}
	
	public static void optimal(int[] nums,int index1,List<List<Integer>> arr) {
		if(index1==nums.length-1) {
			arr.add(Arrays.stream(nums).boxed().toList());
			return;
		}
		for(int i=index1;i<nums.length;i++) {
			int x = nums[i];
			int y = nums[index1];
			nums[index1] = x;
			nums[i] = y;
			optimal(nums,index1+1,arr);
			int x1 = nums[i];
			int y1 = nums[index1];
			nums[index1] = x1;
			nums[i] = y1;
		}
	}
	
	

}
