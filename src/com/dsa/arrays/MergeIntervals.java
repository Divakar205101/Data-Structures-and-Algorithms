package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
//		int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
		int[][] arr = {{8,10},{15,18}};
		int[][] merge = merge(arr);
		for (int i = 0; i < merge.length; i++) {
			for (int j = 0; j < merge[i].length; j++) {
				System.out.print(merge[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	 public static int[][] merge(int[][] intervals) {
		  Arrays.sort(intervals, (o1,o2)->Integer.compare(o1[0],o2[0]));
		  List<int[]> list = new ArrayList<>();
		  int [] curr_interval = intervals[0];
		  list.add(curr_interval);
			  for (int[] interval : intervals) {
				  if (curr_interval[1]>interval[0]) {
					  curr_interval[1] = Math.max(curr_interval[1], interval[1]);
				} else {
					curr_interval =	interval;
					list.add(interval);
				}
			  }
			  return list.toArray(new int[list.size()][]);
	  }

}
