package com.dsa.starproblems;

public class SetZerosToMatrix {

	public static void main(String[] args) {
		int[][] matrix= {{1,1,1},{1,0,1},{1,1,1}};
		optimal(matrix);
        for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		} 
	}
	
	public static  void solve(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==0) {
					row(i,matrix);
					col(j,matrix);
				}
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==-1) {
					matrix[i][j]=0;
				}
			}
		}
	}
	
	
	public static void betterapproac(int[][] matrix) {
		int [] row =new int[matrix.length];
		int [] col = new int[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==0) {
					row[i]=1;
					col[j]=1;
				}
			}
		}
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(row[i]==1 || col[j]==1) {
					matrix[i][j]=0;
				}
			}
		}
		
	}
	
	public static void optimal(int[][] matrix) {
		int co1=1;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==0) { 
					matrix[i][0]=0;
					if(j!=0) 
						matrix[0][j]=0;
					else
						co1=0;
				}
			}
		}
		
		for(int i=1;i<matrix.length;i++) {
			for(int j=1;j<matrix[i].length;j++) {
				if(matrix[0][j]==0 || matrix[i][0]==0) {
					matrix[i][j]=0;
				}
			}
		}
		
		if(matrix[0][0]==0) 
			for(int j=0;j<matrix[0].length;j++)matrix[0][j]=0;
		if(co1==0)
			for(int i=0;i<matrix.length;i++)matrix[i][0]=0;
	}
	
	public static void row(int i,int[][] matrix) {
		for(int j=0;j<matrix[i].length;j++) {
			if(matrix[i][j]!=0)matrix[i][j]=-1;
		}
	}
	
	public static void col(int j,int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			if(matrix[i][j]!=0)matrix[i][j]=-1;
		}
	}

}
