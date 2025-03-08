package com.dsa.starproblems;

import java.util.*;


public class BetterString {

	public static void main(String[] args) {
		System.out.println(betterString("gboubwd", "bekoilx"));
	}

	public static String betterString(String str1, String str2) {
		int x = count(str1);
		int y = count(str2);
		if(x<y)
			return str2;
		return str1;
	}

	public static int count(String str) {
        Map<Character, Integer> hashMap = new HashMap<>();
        int[] dp = new int[str.length()+1];
        dp[0] = 1;
        for(int i=1;i<=str.length();i++) {
        	 dp[i] = 2 * dp[i-1];
        	 if(hashMap.containsKey(str.charAt(i-1))) {
        		 dp[i] = dp[i] -  dp[hashMap.get(str.charAt(i-1))]; 
        	 }
        	 hashMap.put(str.charAt(i-1), (i-1));
        	 
        }
        return dp[str.length()];
	}

}
