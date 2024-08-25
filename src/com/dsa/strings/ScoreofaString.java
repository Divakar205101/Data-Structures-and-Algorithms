package com.dsa.strings;

public class ScoreofaString {

	public static void main(String[] args) {
//		scoreOfString("hello");
		System.out.println(scoreOfString("hello"));
	}

	public static int scoreOfString(String s) {
		return recur(s,0,0);
	}
	
	public static int recur(String s,int index,int res) {
		if(index==s.length()-1)
			return res;
		res+= Math.abs(s.charAt(index)-s.charAt(index+1)); 
		return recur(s,index+1,res);
	}

}
