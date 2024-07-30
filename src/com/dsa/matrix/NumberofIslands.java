package com.dsa.matrix;

public class NumberofIslands {

	public static void main(String[] args) {
		char[][] c = {
			    {'1', '1', '1', '1', '0'},
			    {'1', '1', '0', '1', '0'},
			    {'1', '1', '0', '0', '0'},
			    {'0', '0', '0', '0', '0'}
			};
       System.out.println(numIslands(c));

	}
	
	 public static int numIslands(char[][] grid) {
	    int count = 0;
	    for (int i = 0; i < grid.length; i++) {
			  for (int j = 0; j < grid[i].length; j++) {
				char c = grid[i][j];
				if (c=='1') {
					count++;
					bts(grid,i,i);
				}
			}
		}
	    return count;
	 }
	 
	 public static void bts(char[][] grid,int i,int j) {
		 if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0') return;
		 grid[i][j]='0';
		 bts(grid,i+1,j);
		 bts(grid,i-1,j);
		 bts(grid,i,j-1);
		 bts(grid,i,j+1);
	 }

}
