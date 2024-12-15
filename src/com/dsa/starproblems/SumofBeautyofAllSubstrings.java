package com.dsa.starproblems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SumofBeautyofAllSubstrings {

	public static void main(String[] args) {
		String s = "xzvfsppsjfbxdwkqe";
		int a = optimal(s);
		System.out.println(a);
	}

	public static int beautySum(String s) {
		int count=0;
		for(int i = 0; i < s.length(); i++) {
			int max=1,min=1;
			Map<Character, Integer> map = new HashMap<>();
			map.put(s.charAt(i), 1);
			for (int j = i+1; j < s.length(); j++) {
                
				if(map.containsKey(s.charAt(j))){
                	 map.put(s.charAt(j), map.get(s.charAt(j))+1);
                 }else {
                	 map.put(s.charAt(j), 1);
                 }
                 
				 max= map.get(s.charAt(j)) > max ? map.get(s.charAt(j)) : max; 
                 min =  Collections.min(map.values());
                
                 if(map.size()>1) {
                	 count+=max-min;
                 }
			}
		}
		return count;
	}
	
	public static int optimal(String s) {
		int count=0;
		for(int i = 0; i < s.length(); i++) {
			int [] charecs = new int [26];
			for (int j = i; j < s.length(); j++) {
				int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
				charecs[s.charAt(j)-'a']++;
				for (int k = 0; k < 26; k++) {
					  if(charecs[k]>0) {
						  max = Math.max(max, charecs[k]);
						  min = Math.min(min, charecs[k]);
					  }
				}
				count+=max-min;
			}
		}
		return count;
	
	}

}
