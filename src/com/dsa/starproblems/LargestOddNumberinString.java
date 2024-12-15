package com.dsa.starproblems;

public class LargestOddNumberinString {

	public static void main(String[] args) {
		String number = "35427";
		System.out.println(largestOddNumber(number));
	}

	public static String largestOddNumber(String num) {
		for (int i = num.length() - 1; i >= 0; i--) {
			if (num.charAt(i) % 2 != 0) {
				return num.substring(0, i + 1);
			}
		}
		return "";
	}

}
