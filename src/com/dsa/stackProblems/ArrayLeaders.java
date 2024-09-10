package com.dsa.stackProblems;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {

	public static void main(String[] args) {
		int n = 6; int arr[] = {16,17,4,3,5,2};
		System.out.println(leaders(n,arr));

	}
	
	 static ArrayList<Integer> leaders(int n, int arr[]) {
      ArrayList<Integer> res = new ArrayList<>(arr.length);
      res.add(arr[arr.length-1]);
      for (int i = arr.length-1; i>0; i--) {
		    if(arr[i-1]>=res.get(res.size()-1))
		    	res.add(arr[i-1]);
      }
      Collections.reverse(res);
      return res;
	 }

}
