package com.dsa.starproblems;

import java.util.ArrayList;
import java.util.List;

public class MissingAndRepeating {

	public static void main(String[] args) {
		int arr[] = {8 ,6 ,2, 3, 1, 5 ,7, 4 ,10 ,1};
//		10 8 1 2 6 5 7 9 10 4
		int[] findTwoElement = findTwoElement(arr);
		optimal1(findTwoElement);
		for (int i : findTwoElement) {
			System.out.print(i);
		}
	}

	public static int[] findTwoElement(int arr[]) {
		int[] res = new int[2];
		int size = arr.length;
		int sum = size * (size + 1) / 2, arrsum =0;
		int element =-1;
		 for (int i = 0; i < arr.length; i++) {
			 arrsum+=arr[i];
	            // Get the absolute value of the current element
	            int index = Math.abs(arr[i]) - 1;

	            // If the value at the index is already negative, it's the duplicate
	            if (arr[index] < 0) {
	            	element = Math.abs(arr[i]);
	            }

	            // Mark the element at the index as visited by negating it
	            arr[index] = -arr[index];
	        }
		
		res[0] = element;
		if (arrsum > sum) {
			res[1] = element - (arrsum - sum);
		} else {
			res[1] = element + (sum - arrsum);
		}

		return res;
	}
	
	public static int [] better(int arr[]) {
		int [] res = new int[2];
		int [] list = new int[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			list[arr[i]]++;
		}
		for(int j=0;j<list.length;j++) {
			if(list[j]>1)res[0]=j;
			if(list[j]==0)res[1]=j;
		}
		return res;
	}
	
	// x-y=v1;
	// x2-y2=v2;
	// x is duplicate number and y is missing number
	public static int [] optimal1(int [] nums) {
		long size = nums.length;
		long S=0,S2=0,SN=size * (size + 1) / 2,S2N= (size*((size+1)*(2*size+1)))/6;
		for(int i=0;i<nums.length;i++) {
			S+=nums[i];
			S2+=nums[i]*nums[i];
		}
		
		long v1 = S-SN;
		long v2 = S2-S2N;
		
		v2 = v2/v1;
		long x=(v2+v1)/2;
		long y= x-v1;
		return new int[]{(int) x,(int) y};
	}
	
	 public static int findDuplicate(int[] arr,int sum) {
	        for (int i = 0; i < arr.length; i++) {
	        	sum+=arr[i];
	            // Get the absolute value of the current element
	            int index = Math.abs(arr[i]) - 1;

	            // If the value at the index is already negative, it's the duplicate
	            if (arr[index] < 0) {
	                return Math.abs(arr[i]);
	            }

	            // Mark the element at the index as visited by negating it
	            arr[index] = -arr[index];
	        }
	        // If no duplicate is found, return -1 (just as a failsafe)
	        return -1;
	    }

}
