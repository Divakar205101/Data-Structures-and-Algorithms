package com.dsa.arrays;

public class CountNegativeNumbersinaSortedMatrix {

	public static void main(String[] args) {
		int [] [] nums = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		System.out.println(countNegatives(nums));

	}

	public static int countNegatives(int[][] grid) {
		int count =0;
        for(int i=0;i<grid.length;i++) {
        	for(int j=grid[i].length-1;j>=0;j--) {
        		if(grid[i][j]<0)
        			count++;
        		else
        			break;
        	}
        }
        return count;
	}

}
