package com.dsa.starproblems;

public class problemNo1614 {

	public static void main(String[] args) {
		String s =  "()(())((()()))";
		System.out.println(maxDepth(s));
	}
	
	public static int maxDepth(String s) {
		int a = 0, c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				c++;
			else if (s.charAt(i) == ')')
				c--;
			a = Math.max(a, c);
		}
		return a;
	}

}
