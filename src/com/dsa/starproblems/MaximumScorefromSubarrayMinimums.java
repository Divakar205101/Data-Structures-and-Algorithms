package com.dsa.starproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumScorefromSubarrayMinimums {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(5, 4, 3, 1, 6)); 
		System.out.println(pairWithMaxSum(list));
	}
	
	public static int pairWithMaxSum(List<Integer> arr) {
       int res=0;
        for (int i = 1; i < arr.size(); i++) {
			int curr = arr.get(i-1)+arr.get(i);
			res = Math.max(res, curr);
		} 
       return res;
    }

}
