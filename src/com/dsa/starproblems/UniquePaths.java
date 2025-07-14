package com.dsa.starproblems;

public class UniquePaths {

	public static void main(String[] args) {
		UniquePaths uniquePaths = new UniquePaths();
		System.out.println(uniquePaths.uniquePaths(3, 2));

	}

	public int uniquePaths(int m, int n) {
//		int[][] dp = new int[n][m];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                dp[i][j] = -1;
//            }
//        }
//     return optimal(0,0,m,n,dp);
		
		int N = n +m-2;
		int r= m-1;
		double res = 1;
		for(int i=1;i<=r;i++) {
			res = res * (N-r+i)/i;
		}
		
		return (int)res;
		
	}
	
	public int count(int i,int j,int m,int n) {
		if(i==(m-1) && j==(n-1)) return 1;
		if(i>=m || j>=n) return 0;
		else return count(i+1,j,m,n)+count(i,j+1,m,n);
	}
	
	public int optimal(int i,int j,int m,int n,int [][] dp ) {
		// Base Case: Reached bottom-right cell
        if (i == (n - 1) && j == (m - 1)) return 1;

        // Out of bounds
        if (i >= n || j >= m) return 0;

        // If already computed
        if (dp[i][j] != -1) return dp[i][j];

        // Recursively compute and store
        return dp[i][j] = optimal(i + 1, j, n, m, dp) + optimal(i, j + 1, n, m, dp);
	}

}
