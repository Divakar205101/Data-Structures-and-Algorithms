package com.dsa.starproblems;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseanArray {
    
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter data ::");
		String nextLine = scanner.nextLine();
		int[] array = Arrays.stream(nextLine.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		ReverseanArray reverseanArray = new ReverseanArray();
		reverseanArray.reverseArray(array);
	}

	public void reverseArray(int arr[]) {
		int l=0,r=arr.length;
		solve(arr,l,r-1);
		Arrays.stream(arr).forEach(System.out::print);
	}
	
	public void solve(int []arr,int l,int r) {
		if(r<l)
			return;
		int t=arr[l];
		arr[l]=arr[r];
		arr[r]=t;
		solve(arr,l+1,r-1);
	}

}
