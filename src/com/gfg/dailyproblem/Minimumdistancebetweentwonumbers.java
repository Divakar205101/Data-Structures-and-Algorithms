package com.gfg.dailyproblem;

public class Minimumdistancebetweentwonumbers {
	public static void main(String[] args) {
		int[] a = { 5, 2, 3, 2 };
		System.out.println(minDist(a, 4, 2, 5));
	}

	public static int minDist(int a[], int n, int x, int y) {

		int first = -1;
		int second = -1;
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (a[i] == x) {
				first = i;
			}
			if (a[i] == y) {
				second = i;
			}
		}
		if (first != -1 && second != -1) {
			ans = Math.min(ans, Math.abs(second - first));
		}
		if (first == -1 || second == -1) {
			return -1;
		}
		return ans;

		
	}
}
