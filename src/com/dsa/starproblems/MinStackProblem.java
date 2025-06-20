package com.dsa.starproblems;

import java.util.Stack;

public class MinStackProblem {
	
	static class MinStack {
		
		int min = Integer.MAX_VALUE;
		Stack<Integer> stack;

	    public MinStack() {
	    	stack = new Stack<>();
	    }
	    
	    public void push(int val) {
	    	if(val<=min) {
		    	stack.push(min);
		    	min = val;
	    	}
	    	stack.push(val);
	    }
	    
	    public void pop() {
	    	if(stack.pop() == min) min=stack.pop();
	    }
	    
	    public int top() {
	    	return stack.peek();
	    }
	    
	    public int getMin() {
	      
	        return min;
	    }
	}

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());
		minStack.getMin();
		minStack.pop();
		minStack.top();
		System.out.println(minStack.getMin());
	}

}
