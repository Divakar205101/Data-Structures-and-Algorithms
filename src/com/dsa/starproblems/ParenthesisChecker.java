package com.dsa.starproblems;

import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		String s = "[{()}]";
		System.out.println(isBalanced(s));
	}

	static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);

			if (charAt == '(' || charAt == '{' || charAt == '[') {
				stack.push(s.charAt(i));

			} else if (stack.isEmpty() || (stack.peek() != '(' && charAt == ')') 
					|| stack.peek() != '{' && charAt == '}'
					|| stack.peek() != '[' && charAt == ']') {

				return false;

			} else {

				stack.pop();

			}

		}

		return stack.isEmpty() ? true : false;
	}

}
