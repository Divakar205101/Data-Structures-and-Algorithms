package com.dsa.starproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTwo {

	public static void main(String[] args) {
		System.out.println(combinationSum(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8));

	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(candidates);
		solve(result, 0, candidates, target, new ArrayList<>());
		return result;
	}

	public static void solve(List<List<Integer>> result, int index, int[] candidates, int target, List<Integer> temp) {

		if (target == 0) {
			result.add(new ArrayList<>(temp));
			return;
		}
		for (int i = index; i < candidates.length; i++) {
			if (i > index && candidates[i] == candidates[i - 1]) {
				continue;  
			}
			if (candidates[i] > target)
				break;

			temp.add(candidates[i]);
			solve(result, i + 1, candidates, target - candidates[i], temp);
			temp.remove(temp.size() - 1);

		}

	}

}
