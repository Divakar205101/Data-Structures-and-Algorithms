package com.dsa.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArraysII {

	public static void main(String[] args) {
		int num1 [] = {4,9,5};
		int num2 [] = {9,4,9,8,4};
		int[] intersect = intersect(num1,num2);
		for (int i : intersect) {
			System.out.println(i);

		}
	}
	
	 public static int[] intersect(int[] nums1, int[] nums2) {
		 List<Integer> res = new ArrayList<>();
		 
	      Map<Integer, Integer> map = new HashMap<>();
	      for (int i : nums1) {
			 if (map.containsKey(i)) {
				 map.put(i, map.get(i)+1);
			} else {
				map.put(i, 1);		
			}
		  }
	      for (int i : nums2) {
			 if (map.containsKey(i)) {
				 Integer integer = map.get(i);
				 if (integer>=1) {
					 res.add(i);
					 map.put(i, integer-1);
				}
			} 
		  } 
	      int arr [] = new int[res.size()];
	      int c =0 ;
	      for (int i : res) {
	    	  arr[c] = i;
	    	  c++;
		}
	      return arr;
	 }

}
