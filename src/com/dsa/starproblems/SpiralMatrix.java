package com.dsa.starproblems;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	//Moves
	// LEFT --> RIGHT
	// RIGHT --> BOTTOM
	// LEFT --> RIGHT
	// BOTTOM --> TOP
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		List<Integer> spiralOrder = spiralOrder(matrix);
		spiralOrder.forEach(System.out::println);
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		int n = matrix.length - 1;
		int m = matrix[0].length - 1;
		int left = 0;
		int top = 0;
		int right = m;
		int bottom = n;
		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++) {
				list.add(matrix[top][i]);
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				list.add(matrix[i][right]);
			}
			right--;
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					list.add(matrix[bottom][i]);
				}
				bottom--;
			}
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					list.add(matrix[i][left]);
				}
				left++;
			}
		}
		return list;
	}

}
