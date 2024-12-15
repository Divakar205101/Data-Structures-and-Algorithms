package com.dsa.starproblems;

public class SubstringswithKDistinct {

	public static void main(String[] args) {
		String s = "aba";
		int k = 2;
		int ans = countSubstr1(s, k) - countSubstr1(s, k - 1);
		System.out.println(ans);
	}

	static int countSubstr1(String s, int k) {
		if (s.length() == 0)
			return 0;
		int[] charecterIndex = new int[26];
		int distincChar = 0, left = 0, res = 0;
		for (int i = 0; i < s.length(); i++) {
			int charIndex = s.charAt(i) - 'a';
			charecterIndex[charIndex]++;

			if (charecterIndex[charIndex] == 1)
				distincChar++;

			while (distincChar > k) {
				charecterIndex[s.charAt(left) - 'a']--;
				if (charecterIndex[s.charAt(left) - 'a'] == 0) {
					distincChar--;
				}
				left++;
			}
			res += (i - left + 1);
		}
		return res;
	}

}
