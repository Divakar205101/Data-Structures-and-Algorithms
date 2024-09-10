package com.dsa.starproblems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArraywithSumK {

	public static void main(String[] args) {
		int nums [] = {1 ,4 ,3 ,3, 5 ,5};
		System.out.println(lenOfLongSubarr(nums,nums.length,16));
	}
	
	 public static int lenOfLongSubarr(int A[], int N, int K) {
	       int res = 0;
	       int i=0;
	       int sum=A[0];
	       int start =0;
	       while(i<N) {
	    	  
	    	   while(start<=i && start>K)
					sum-=A[start++];
	    	   if (sum==K) {
	    		   res = Math.max(i-start+1, res);
	    	   	} 
	    	   i++;
	    	   if(i<N) sum+=A[i];
	       }
	       return res;
	 }
	 
	 public static int bruteforce(int A[],int N,int K) {
		int sum=0;
		int res=0;
		 for (int i = 0; i < A.length; i++) {
			 sum+=A[i];
			 if(sum==K)
				 res = Math.max(res, 1);
			for (int j = i+1; j < A.length; j++) {
				sum+=A[j];
				 if(sum==K)
				 res = Math.max(res, (j-i+1));
			}
			sum = 0;
		}
		 return res;
	 }
	 
		// Better solution {2,0,0,3} line-23
	 public static int lenOfLongSubarr1(int A[], int N, int K) {
		 Map<Integer, Integer> map = new HashMap<>();
		 int sum=0;
		 int res = 0;
		 for(int i=0;i<N;i++) {
			 sum+=A[i];
			 if(sum==K)
				 res = Math.max(res, i+1);
			 if(!map.containsKey(sum))
			 map.put(sum,i);
			 if(map.containsKey(sum-K)) {
				 Integer integer = map.get(sum-K);
				 res = Math.max(res,i-integer);
			 }
		 }
		 return res;
	 }

}
