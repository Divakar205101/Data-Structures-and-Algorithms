package com.dsa.starproblems;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		System.out.println(combinationSum(new int []{2,3,6,7},7));
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result =  new ArrayList<>();
		solve(result,0,candidates,target,new ArrayList<>());
		return result;
	}
	
	public static void solve(List<List<Integer>> result,int index,int[] candidates,int target,List<Integer> temp) {
		if(index==candidates.length) {
			if(target==0) {
				result.add(new ArrayList<>(temp));
			}
				return;
		}
		
		if(candidates[index]<=target) {
			temp.add(candidates[index]);
			solve(result,index,candidates,target-candidates[index],temp);
			temp.remove(temp.size()-1);
		}
		
		solve(result,index+1,candidates,target,temp);
	}

}
