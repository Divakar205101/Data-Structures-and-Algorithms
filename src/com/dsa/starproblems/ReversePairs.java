package com.dsa.starproblems;

import java.util.ArrayList;
import java.util.List;

public class ReversePairs {

	public static void main(String[] args) {
		 int[] a = {1,3,2,3,1};
	        int n = 5;
	        int cnt = reversePairs(a);
	        System.out.println("The number of reverse pair is: " + cnt);

	}
	
	 public static int reversePairs(int[] nums) {
	     return mergeSort(nums,0,nums.length-1);
	 }
	 
	 public static int mergeSort(int[] arr,int low,int high) {
		 int count=0;
		 if(low>=high)return count;
		 int mid = (low+high)/2;
		 count+=mergeSort(arr,low,mid);
		 count+=mergeSort(arr,mid+1,high);
		 count+=countReversePairs(arr,low,mid,high);
		 merge(arr,low,mid,high);
		 return count;
	 }
	 
	 public static void merge(int[] arr,int low,int mid,int high) {
		 List<Integer> temp= new ArrayList<>();
		 
		 int left=low;
		 int right=mid+1;
		 
		 while(left<=mid && right<=high) {
			 if(arr[left]<=arr[right]) {
				 temp.add(arr[left]);
				 left++;
			 }else {
				 temp.add(arr[right]);
				 right++;
			 }
		 }
		 
		 while(left<=mid) {
			 temp.add(arr[left++]);
		 }
		 
		 while(right<=high) {
			 temp.add(arr[right++]);
		 }
		 
		 for(int i=low;i<=high;i++)
			 arr[i]=temp.get(i-low);
	 }
	 
	 public static int countReversePairs(int[] arr,int low,int mid,int high) {
		 int right =mid+1;
		 int count =0;
		 for(int i=low;i<=mid;i++) {
			  while(right<=high && arr[i] > 2*arr[right])right++;
			  count+=(right-(mid+1));
		 }
		 return count;
	 }

}
