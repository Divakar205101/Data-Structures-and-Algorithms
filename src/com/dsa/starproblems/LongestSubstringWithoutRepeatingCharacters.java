package com.dsa.starproblems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}

	public static int lengthOfLongestSubstring(String s) {
		// Int this probelm when char contains left moving to right to reduce the size
		int max = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int right = 0, left = 0; right < s.length(); right++) {
			char c = s.charAt(right);
			if (map.containsKey(c) && map.get(c) >= left) {
				left = map.get(c) + 1;
			}
			map.put(c, right);
			max = Math.max(max, right - left + 1);
		}
		return max;
	}

}
