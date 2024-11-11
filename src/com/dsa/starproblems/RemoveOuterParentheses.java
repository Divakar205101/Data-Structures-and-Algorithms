package com.dsa.starproblems;

import java.util.Stack;

public class RemoveOuterParentheses {

	public static void main(String[] args) {
		String s = "(()())(())(()(()))";
		System.out.println(removeOuterParentheses(s));
	}
	
	public static String removeOuterParentheses(String s) {
		int count=0;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			 if(s.charAt(i)==')')count--;
			 if(count!=0)stringBuilder.append(s.charAt(i));
			 if(s.charAt(i)=='(')count++;
		}
		return stringBuilder.toString();
	}
	
	public static String usingStack(String s){
		Stack<Character> stack = new Stack<Character>();
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			 if (s.charAt(i)=='(') {
				 if (stack.size()>0) {
					sb.append(s.charAt(i));
				}
				 stack.push(s.charAt(i));
			} else {
				stack.pop();
				if (stack.size()>0) {
					sb.append(s.charAt(i));
				}

			}	
		}
		return sb.toString();
	}

}
