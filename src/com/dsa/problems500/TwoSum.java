package com.dsa.problems500;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSum {

	public static void main(String[] args) {
		int [] nums = {2,7,11,15};
		int[] twoSum = twoSum(nums,9);
		for (int i = 0; i < twoSum.length; i++) {
			System.out.println(twoSum[i]);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		int [] result=new int[2];
		for (int i = 0; i < list.size(); i++) {
			int res=target-list.get(i);
			if (list.contains(res)) {
				result[0]=i;
				result[1]=list.indexOf(res);
				break;
			}
		}
        return result;
    }

}
