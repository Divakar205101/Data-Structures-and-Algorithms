package com.dsa.starproblems;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

	public static void main(String[] args) {
		int arr [] = {3,-3,1,1,1};
		int k=3;
		System.out.println(better(arr,k));
	}

	public static int subarraySum(int[] nums, int k) {
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			int total=nums[i];
			if(total==k)
				count++;
			for (int j = i+1; j < nums.length; j++) {
				total+=nums[j];
				if(total==k)
					count++;
			}
		}
		return count;
	}
	
	public static int better(int[] nums, int k) {
		int total=0,count=0;
		Map<Integer, Integer> map= new HashMap<>(nums.length);
		map.put(0, 1);
		for(int i=0;i<nums.length;i++) {
			total+=nums[i];
			Integer remove = total-k;
			if(map.containsKey(remove))
				count+=map.get(remove);
			if (map.containsKey(total)) {
				map.put(total, map.get(total)+1);
			} else {
				map.put(total, 1);
			}
		}
		
		return count;
	}

}
