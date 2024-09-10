package com.dsa.arrays;

import java.util.ArrayList;
import java.util.TreeSet;

public class UnionofTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 4, 5 };
		int[] nums2 = { 1, 2, 3, 6, 7 };
		ArrayList<Integer> optimal = optimal(nums1,nums2);
		for (Integer integer : optimal) {
			System.out.println(integer);
		}

	}

	public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
		TreeSet<Integer> set = new TreeSet<>();
		for (int i : arr1)
			set.add(i);
		for (int i : arr2)
			set.add(i);
		return new ArrayList<>(set);
	}

	public static ArrayList<Integer> optimal(int arr1[], int arr2[]) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		int i = 0, j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				if (arrayList.size() == 0|| arrayList.get(arrayList.size()-1) != arr1[i]) {
					arrayList.add(arr1[i]);
				}
				i++;
			} else {
				if (arrayList.size() == 0 || arrayList.get(arrayList.size()-1) != arr2[j]) {
					arrayList.add(arr2[j]);
				}
				j++;
			}

		}
		while (i < arr1.length) {
			if(arrayList.get(arrayList.size()-1) != 0)
			arrayList.add(arr1[i++]);
		}
		while (j < arr2.length) {
			if(arrayList.get(arrayList.size()-1) != 0)
			arrayList.add(arr2[j++]);
		}
		return arrayList;
	}

}
