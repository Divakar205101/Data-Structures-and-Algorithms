package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

	public static void main(String[] args) {
		int [] nums = {4,3,2,7,8,2,3,1};
		findDisappearedNumbers(nums);
	}
	
	public static void findDisappearedNumbers(int[] nums) {
		  List<Integer> list  = new ArrayList<>();
	        for(int i : nums){
	           int n= Math.abs(i);
	           if(n>0){
	            nums[n-1] = -1* nums[n-1];
	           }
	        }
	        for(int i : nums){
	            if(i>0) list.add(i);
	        }
	        System.out.println(list);
    }

}
