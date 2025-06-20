package com.dsa.starproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {

	public static void main(String[] args) {
		int[] nums1 = {4,1,2}; int[] nums2 = {1,3,4,2};
		int[] nextGreaterElement = nextGreaterElementOptimal(nums1,nums2);
		for (int i : nextGreaterElement) {
			System.out.println(i);
		}
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] ans = new int[nums1.length];
		int count=0;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i]==nums2[j]) {
					getNextMax(j+1, nums2.length,nums2[j],nums2,ans,i,count);
					count++;
					break;
				}
			}
		}
		return ans;
	}
	
	public static void getNextMax(int i,int n,int x,int[] nums2,int[] ans,int out,int count) {
		for (int j2 = i; j2 < n; j2++) {
			   if (nums2[j2]>x) {
				   ans[count]=nums2[j2];
				   break;
			  }
		}
		
		if (ans[out]==0) {
			ans[count]=-1;
		}
		
		
	}
	
	public static int[] nextGreaterElementOptimal(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		Stack<Integer> stack = new Stack<Integer>();
		for(int num:nums2) {
			while(!stack.isEmpty()&&stack.peek()<num) {
				map.put(stack.pop(), num);
			}
			stack.push(num);
		}
		for (int i = 0; i < nums1.length; i++) {
			nums1[i]=map.getOrDefault(nums1[i], -1);
		}
		return nums1;
	}

}
