package com.dsa.bits;

public class CountingBits {

	public static void main(String[] args) {
		int[] solve = solve(5);
		for (int i : solve) {
			System.out.println(i);
		}
	}
	
	public static int[] solve(int n) {
		int ans [] = new int [n+1];
		ans[0] = 0;
		for(int i=1;i<=n;i++) {
			if(i%2==0)
				ans[i]=ans[i/2];
			else 
				ans[i]=ans[i/2]+1;
		}
		return ans;
	}
}
