package com.dsa.stackProblems;


import java.util.Iterator;
import java.util.Stack;
@SuppressWarnings("rawtypes")
public class RemovingStarsFromaString {

	public static void main(String[] args) {
      System.out.println(removeStars("leet**cod*e"));
	}

	  public static String removeStars(String s) {
		  String res="";
		  Stack<Character> stack = new Stack<Character>();
		  char[] charArray = s.toCharArray();
		  for (char c : charArray) {
			 if (c!='*') {
				stack.push(c);
			}else {
				stack.pop();
			}
		}
		 
		Iterator iterator = stack.iterator();  
		  while(iterator.hasNext())  
		  {  
		  Object values = iterator.next();  
		  res+=values;
		  }     
		  
	        return res;
	    }
}
