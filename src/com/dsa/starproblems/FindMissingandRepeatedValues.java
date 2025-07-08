package com.dsa.starproblems;

public class FindMissingandRepeatedValues {

	public static void main(String[] args) {
		int grid [] [] = {{1,3},{2,2}};
		int[] ans = findMissingAndRepeatedValues(grid);
		for (int i = 0; i < ans.length; i++) {
			 System.out.println(ans[i]);
		}
	}
	
     public static int[] findMissingAndRepeatedValues(int[][] grid) {
    	 
    	 int arr [] = new int[grid.length*grid.length+1];
    	 int ans [] = new int [2];
    	 for (int i = 0; i < grid.length; i++) {
			   for (int j = 0; j < grid[i].length; j++) {
				    int e = grid[i][j];
				   if(arr[e]== 0) {
					   arr[e] = 1;
				   }else if(arr[e]== 1) {
					   ans[0] = e;
				   }
				
			    }
		}
    	 
    	 for (int i = 0; i < arr.length; i++) {
			      if(arr[i]==0)
			    	  ans[1]=i;
		  }
    	 
    	 return ans;
        
    }

}
