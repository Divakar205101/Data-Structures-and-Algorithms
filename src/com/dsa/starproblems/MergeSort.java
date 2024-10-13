package com.dsa.starproblems;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {2, 4, 1, 3, 5};
		mergesort(arr,0,arr.length-1);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void mergesort(int[] arr,int low,int high) {
		if(low>=high)return;
		int mid=(low+high)/2;
		mergesort(arr, low, mid);
		mergesort(arr, mid+1, high);
		merge(arr,low,mid,high);
	}
	
	public static void merge(int[] arr,int low,int mid,int high) {
		int left = low,right=mid+1;
		List<Integer> list = new ArrayList<>();
		while(left <=mid && right<=high) {
			 if (arr[left]<=arr[right]) {
				 list.add(arr[left++]);
			} else {
				 list.add(arr[right++]);
			}
		}
		while(left<=mid) {
			list.add(arr[left++]);
		}
		while(right<=high)
			list.add(arr[right++]);
		for (int i = low; i <=high; i++) {
			arr[i]=list.get(i-low);
		}
	}

}
