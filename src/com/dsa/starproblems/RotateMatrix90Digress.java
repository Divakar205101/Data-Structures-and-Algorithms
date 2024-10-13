package com.dsa.starproblems;

public class RotateMatrix90Digress {
    //transepose matrix
	public static void main(String[] args) {
		int[][] matrix= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		bruteforce(matrix);
		for (int i = 0; i < matrix.length; i++) {
			 for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] +" , ");
			}
			 System.out.println();
		}
	}
	
	public static void bruteforce(int [][] matrix) {
		for (int i = 0; i <= matrix.length-2; i++) {
			 for (int j = i+1; j < matrix[i].length; j++) {
				 int temp=matrix[i][j];
				 matrix[i][j]= matrix[j][i];
				 matrix[j][i]=temp;
			}
		}
		swap(matrix);
	}
	
	public static void swap(int [][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			 for (int j = 0,k=matrix[i].length-1; j < matrix[i].length; j++,k--) {
				 if(j<k) {
					 int start=matrix[i][j];
					 matrix[i][j]=matrix[i][k];
					 matrix[i][k]=start;
				}else break;
			}
		}
	}
	
	

}
