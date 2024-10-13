package com.dsa.starproblems;

import java.util.HashMap;
import java.util.Map;

public class Largestsubarraywith0sum {

	public static void main(String[] args) {
		int arr [] = {452, -881, -493, -391, -952, 803, 653, -354, -590, -537, -943, -487, 546, 
		        -33, 545, 366, -654, 607, 698, -82, -402, -849, 893, 22, 192, 496, -438, 
		        324, -756, -725, -464, 651, -689, -621, -957, 391, 296, -767, -796, 376, 
		        54, 830, -557, -532, -509, 971, 351, -799, -579, -779, -830, 900, 764, 
		        20, 513, -253, 970, 763, -586, 197, -553, -128, -137, 297, -54, 609, 601, 
		        719, 879, 629, -834, -307, 318};
		System.out.println(maxLen(arr,arr.length));
	}
	
	public static int maxLen(int arr[], int n)
    {
       int size=0;
       int sum=0;
       Map<Integer, Integer> map = new HashMap<>();
       for(int i=0;i<n;i++) {
    	   sum+=arr[i];
    	   if (sum==0) {
    		   size=i+1;
		} else {
			 if (map.containsKey(sum)) {
	    		   size=Math.max(size,i-map.get(sum));
				} else
					map.put(sum, i);
		}
       }
       return size;
    }

}
