package com.gfg.dailyproblem;

import java.util.HashMap;
import java.util.Map.Entry;

public class RemovingDuplicatesFromArray {

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
       System.out.println(removeDuplicates(nums));
	}
    public static int removeDuplicates(int[] nums) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for(int i=0;i<nums.length;i++) {
    		map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    	}
    	int res=0;
    	for (Entry<Integer, Integer> set :
    		map.entrySet()) {
    		if(set.getValue()>=2) {
    			res+=2;
    		}else {
    			res+=set.getValue();
    		}
    	}
    	return res;
    } 
}
