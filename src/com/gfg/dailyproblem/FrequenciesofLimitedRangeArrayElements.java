package com.gfg.dailyproblem;

import java.util.HashMap;

public class FrequenciesofLimitedRangeArrayElements {

	public static void main(String[] args) {
		int []ar = {2,3,2,3,5};
		frequencyCount(ar,5,8);
	}
	public static void frequencyCount(int arr[], int N, int P)
    {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<arr.length;i++) {
    	  if(arr[i]<P) {
    		 map.put(arr[i], map.getOrDefault(arr[i], 0)+1); 
    	  }
      }
      for(int i=0;i<N;i++) {
    	  if(map.containsKey(i+1)) {
    		  arr[i]=map.get(i+1);
    	  }else {
    		  arr[i]=0;
    	  }
      }
      for(int i=0;i<arr.length;i++) {
    	  System.out.print(arr[i]);
      }
    }	
}
