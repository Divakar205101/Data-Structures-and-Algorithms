package com.dsa.starproblems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 3, 3 };
		int target = 6;
		int[] twoSum = twoSum(nums, target);
		for (int i : twoSum) {
			System.out.print(i + " ");
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>(nums.length);
		for (int i = 0; i < nums.length; i++) {
			if (!map.isEmpty()) {
				if (map.containsKey(target-nums[i])) {
					return new int[]{map.get(target-nums[i]),i};
				}else
				map.put(nums[i],i);
			} else 
				map.put(nums[i],i);
		}
		return new int[]{0,0};
	}

}