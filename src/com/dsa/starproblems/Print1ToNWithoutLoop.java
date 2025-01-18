package com.dsa.starproblems;

public class Print1ToNWithoutLoop {
	public static void main(String[] args) {
		printNos(5,5);
	}
	
	 public static void printNos(int n,int i) {
	      if(i<0)
	    	  return;
	      printNos(n,i-1);
	      System.out.print(i +" ");
	 }

}
