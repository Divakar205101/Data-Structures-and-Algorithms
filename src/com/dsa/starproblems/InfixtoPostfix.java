package com.dsa.starproblems;

import java.util.Stack;

public class InfixtoPostfix {

	public static void main(String[] args) {
		String s = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(infixToPostfix(s));
	}
	
	 public static int priority(char ch) {
	        if (ch == '+' || ch == '-') return 1;
	        if (ch == '*' || ch == '/') return 2;
	        if (ch == '^') return 3;
	        return -1; 
	    }
	
	public static String infixToPostfix(String s) {
       StringBuilder answer = new StringBuilder();
       Stack<Character> stack = new Stack<Character>();
         for (Character character : s.toCharArray()) {
			if ((character>='A'&&character<='Z')||
					(character>='a'&&character<='z')||(character>='0'&&character<='9')) {
				answer.append(character);
				
			} else if(character=='('){
				stack.push(character);

			}else if(character==')') {
				while (!stack.isEmpty() && stack.peek()!='(') {
					answer.append(stack.pop());
					
				}
				stack.pop();
			}else {
				while(!stack.isEmpty()&& priority(character)<=priority(stack.peek())) {
					answer.append(stack.pop());
				}
				 stack.push(character);
			}
		}
         
         while(!stack.isEmpty()){
        	 answer.append(stack.pop());
         }
         return answer.toString();
        
    }

}
