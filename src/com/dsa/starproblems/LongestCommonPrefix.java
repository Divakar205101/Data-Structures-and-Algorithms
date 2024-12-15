package com.dsa.starproblems;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] arr = { "flower", "flow", "flight"};
		System.out.println(longestCommonPrefix(arr));
	}

	public static String longestCommonPrefix(String[] strs) {
		StringBuilder sb = new StringBuilder(strs[0]);
		StringBuilder ans = new StringBuilder();
		for (int i = 1; i < strs.length; i++) {
			if (strs[i].length() < sb.length())
				sb = new StringBuilder(strs[i]);
		}
		for (int i = 0; i < sb.length(); i++) {
			boolean flag = false;
			for (int j = 0; j < strs.length; j++) {
				if (sb.toString().charAt(i) == strs[j].charAt(i)) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if (flag)
				ans.append(sb.charAt(i));
			else
				break;

		}
		return ans.toString();
	}

	public static String optimal(String[] strs) {
		Arrays.sort(strs);
		StringBuilder ans = new StringBuilder();
		String first = strs[0];
		String last = strs[strs.length - 1];

		for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
			if (first.charAt(i) != last.charAt(i)) {
				return ans.toString();
			}
			ans.append(first.charAt(i));
		}
		return ans.toString();
	}

	
}
