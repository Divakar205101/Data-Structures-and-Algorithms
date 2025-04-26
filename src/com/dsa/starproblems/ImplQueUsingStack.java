package com.dsa.starproblems;

import java.util.Stack;

public class ImplQueUsingStack {
	
	static class MyQueue {
		
		Stack<Integer> stack;

	    public MyQueue() {
	    	stack = new Stack<Integer>();
	    }
	    
	    public void push(int x) {
	    	Stack<Integer> temp =  new Stack<Integer>();
	    	if(!stack.isEmpty()) {
	    		while(!stack.isEmpty()) {
	    			temp.push(stack.pop());
	    		}
	    		stack.push(x);
	    		
	    		while(!temp.isEmpty()) {
	    			stack.push(temp.pop());
	    		}
	    		
	    	}else {
	    		stack.push(x);
	    	}
	    }
	    
	    public int pop() {
	        return stack.pop();
	    }
	    
	    public int peek() {
	        return stack.peek();
	    }
	    
	    public boolean empty() {
	        return stack.isEmpty();
	    }
	}

	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		myQueue.push(1);
		myQueue.push(2);
		myQueue.push(3);
		myQueue.push(4);
		System.out.println("poped element :: " +myQueue.pop());
		myQueue.push(5);
		System.out.println("poped element :: " +myQueue.pop());
		System.out.println("poped element :: " +myQueue.pop());
		System.out.println("poped element :: " +myQueue.pop());
		System.out.println("poped element :: " +myQueue.pop());

	}

}
