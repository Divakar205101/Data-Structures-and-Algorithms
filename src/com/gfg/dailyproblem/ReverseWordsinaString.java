package com.gfg.dailyproblem;



public class ReverseWordsinaString {

	public static void main(String[] args) {
		String s = "the sky is blue";
		solve(s);
	}
    public static void solve(String str) {
    	 String[] s1= str.trim().split("\\s+");
    	    String out = "";
    	    for(int i=s1.length-1;i>0;i--){
    	          out += s1[i]+ " ";
    	    }
    	    out = out+s1[0];
    	 System.out.println(out);
    }
}
