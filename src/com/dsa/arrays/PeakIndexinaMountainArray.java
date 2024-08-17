package com.dsa.arrays;

public class PeakIndexinaMountainArray {

	public static void main(String[] args) {
		int[] arr = {3,5,3,2,0};
		System.out.println(peakIndexInMountainArray(arr));
	}
	
	 public static int peakIndexInMountainArray(int[] arr) {
		 int start=0,end=arr.length-1;
		 while(start<=end) {
			 int mid = (start+end)/2;
			 if(mid>0 && arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
				 return mid;
			 else if(mid>0 && arr[mid-1]>arr[mid])
				 end=mid-1;
			 else
				 start=mid+1;
		 }
		 return -1;
	 }

}
