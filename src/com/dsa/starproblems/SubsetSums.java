package com.dsa.starproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSums {

	public static void main(String[] args) {
		subsetSums(new int []{1, 2, 1});

	}

	public static void subsetSums(int[] arr) {
		 List<Integer> result = new ArrayList<>();
	        solve(arr,0,0,result);
//	        Collections.sort(result);
	       System.out.println(result);
	}
	
	 public static void solve(int[] arr,int sum,int index,List<Integer> subsetresult) {
		if(index==arr.length) {
			subsetresult.add(sum);
			return;
		}
		solve(arr,sum+arr[index],index+1,subsetresult);
		solve(arr,sum,index+1,subsetresult);
	}

}
