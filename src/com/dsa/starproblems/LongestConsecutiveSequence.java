package com.dsa.starproblems;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
	}

	public static int longestConsecutive(int[] a) {
		   int n = a.length;
	        if (n == 0) return 0;

	        Set<Integer> set = new HashSet<>();
	        for (int num : a) {
	            set.add(num);
	        }

	        int longest = 1;

	        for (int num : set) {
	            // Check if it's the start of a sequence
	            if (!set.contains(num - 1)) {
	                int current = num;
	                int count = 1;

	                while (set.contains(current + 1)) {
	                    current++;
	                    count++;
	                }

	                longest = Math.max(longest, count);
	            }
	        }

	        return longest;
	}
	
	public int optimal(int[] a) {
		
		
		int len=1;
		Set<Integer> set = new HashSet<>();
		
		for(int i: a)
			set.add(i);
		
		for (Integer x : set) {
			
			if (!set.contains(x-1)) {
				int curr=x;
				int count=1;
				
				
				while(set.contains(curr+1)) {
					
					curr++;
					count++;
				}
				
				len = Math.max(count, len);
				
			}
			
			
			
		}
		
		return len;
	}

}
