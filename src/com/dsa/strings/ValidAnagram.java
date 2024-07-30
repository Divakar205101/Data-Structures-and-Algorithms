package com.dsa.strings;

public class ValidAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram2("anagram","nagaram"));
		

	}
	
	 public  boolean isAnagram(String s, String t) {
		 if(s.length()!=t.length())return false; 
	      for (char c: s.toCharArray()) {
			    s = s.replace(""+c, "");
			    t = t.replace(""+c, "");
			    if(s.length()!=t.length())return false; 
		   }
	       return s.equals(t)?true : false;
	    }
	 
	 public static boolean isAnagram2(String s, String t) {
	        int[] alphabet = new int[26];
	        for (int i = 0; i < s.length(); i++) {
	        	alphabet[s.charAt(i) - 'a']++;
	        } 
	        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
	        for (int i : alphabet) if (i != 0) return false;
	        return true;
	    }

}
