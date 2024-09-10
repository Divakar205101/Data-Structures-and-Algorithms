package com.dsa.starproblems;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		int nums [] = {1,2,4};
		System.out.println(maxProfit(nums));
	}
	
	 public static int maxProfit(int prices[]) {
		 int res=0;
		 for (int i = 0; i < prices.length; i++) {
			 int max = 0;
			for (int j = i+1; j < prices.length; j++) {
				 if(prices[i]<prices[j])
					 max=prices[j];
				 res = Math.max(res, max-prices[i]);	
			}
			
		}
		 return res;
	 }
	 
	 public static int optimal(int[] nums) {
		int min=nums[0],profit=0;
		for(int i=1;i<nums.length;i++) {
			int cost = nums[i];
			profit=Math.max(profit, cost-min);
			min=Math.min(cost, min);
		}
		return profit;
	}

}
