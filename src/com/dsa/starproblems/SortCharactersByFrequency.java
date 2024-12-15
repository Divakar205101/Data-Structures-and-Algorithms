package com.dsa.starproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		String s ="Aabb";
		System.out.println(frequencySort(s));

	}
	
	public static String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        Map<Character, StringBuilder> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				StringBuilder builder = new StringBuilder();
				builder.append(s.charAt(i));
				map.put(s.charAt(i), builder);
			} else {
				map.put(s.charAt(i), map.get(s.charAt(i)).append(s.charAt(i)));
			}
		}
        Map<Character, StringBuilder> sortedMap = map.entrySet()
                .stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().length(), e1.getValue().length()))
                .collect(Collectors.toMap(
                    Map.Entry::getKey,                // Key mapper
                    Map.Entry::getValue,              // Value mapper
                    (e1, e2) -> e1,                   // Merge function (not required here)
                    LinkedHashMap::new                // Collect into LinkedHashMap to maintain order
                ));
        sortedMap.forEach((x,y) -> ans.append(y));
        return ans.toString();
    }
	
	


}
