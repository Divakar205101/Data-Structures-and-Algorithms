package com.dsa.matrix;

public class IslandPerimeter {

	public static void main(String[] args) {
		int grid [][] = {{1,0}};
		islandPerimeter(grid);
	}
	
	public static void islandPerimeter(int[][] grid) {
		int res = 0;
		for(int i=0;i<grid.length;i++) {
			for (int j = 0; j < grid.length; j++) {
				if(grid[i][j]==1) {
					res +=4;
					if(i>0 && grid[i-1][j]==1) res-=2;
					if(j>0 && grid[i][j-1]==1) res-=2;
				}				
			}
		}
       System.out.println(res);
    }

}
