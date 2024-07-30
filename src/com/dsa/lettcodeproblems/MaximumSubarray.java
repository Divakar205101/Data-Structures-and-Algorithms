package com.dsa.lettcodeproblems;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MaximumSubarray {

	public static void main(String[] args) {
		int n[] = {-2,1,-3,4,-1,2,1,-5,4};
		maxSubArray(n);
	}
	
	 public static void maxSubArray(int[] arr) {
	        int max = Integer.MIN_VALUE;
	        int ans = 0 ;
	        
	        for (int i = 0; i < arr.length; i++) {
	            
	           
	            for (int j = i; j < arr.length; j++) {
	            	int n=0;
	               for (int k = i; k <=j; k++) {
	            	   n+=arr[k];
	            	   max = Math.max(n, max);
	               }
	            }
	        }
	       
	 }

}
