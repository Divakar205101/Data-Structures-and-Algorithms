package com.gfg.dailyproblem;

import java.util.HashSet;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		int Arr[] = {10, 5, 19, 1 ,2, 28, 9 ,1 ,25 ,10 ,1 ,21 ,4, 16, 29 ,6 ,7 ,4 ,16 ,28, 23, 4, 2, 4};
		System.out.println(checkTriplet(Arr,24));
	}

	public static boolean checkTriplet(int[] arr, int n) {
	        // code here
	        HashSet<Integer>set=new HashSet<>();
	        for(int i=0;i<n;i++){
	           
	            set.add(arr[i]*arr[i]);
	        }
	        System.out.println(set);
	         for(int i=0;i<n;i++){
	             for(int j=i+1;j<n;j++){
	                 if(set.contains((arr[i]+arr[j])))return true;
	             }
	         }
	         return false;
	    }
}
