package com.dsa.stack;

import java.util.Stack;

public class StepstoMakeArrayNondecreasing {

	public static void main(String[] args) {
		 int[] nums = {5,3,4,4,7,3,6,11,8,5,11};
	        int result = totalSteps(nums);
	       
      System.out.println(result);
	}
	
	 public static int monotonicIncreasing(int[] nums) {
	        Stack<Integer> stack = new Stack<>();
	        int ans = 0;
	        int[] dp = new int[nums.length];
	        for (int i = nums.length - 1; i >= 0; i--){
	            int cur = 0;
	            while(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
	                cur = Math.max(cur + 1, dp[stack.pop()]);
	            }
	            stack.push(i);
	            dp[i] = cur;
	            ans = Math.max(cur, ans);
	        }
	        return ans;
	    }
	 
	 public static int totalSteps(int[] A) {
	        int n = A.length, res = 0, j = -1;
	        int dp[] = new int[n], stack[] = new int[n];
	        for (int i = n - 1; i >= 0; --i) {
	            while (j >= 0 && A[i] > A[stack[j]]) {
	                dp[i] = Math.max(++dp[i], dp[stack[j--]]);
	                res = Math.max(res, dp[i]);
	            }
	            stack[++j] = i;
	        }
	        return res;
	    }

}
