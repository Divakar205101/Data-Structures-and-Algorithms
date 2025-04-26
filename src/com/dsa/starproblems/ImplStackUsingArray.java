package com.dsa.starproblems;

public class ImplStackUsingArray {
	
	static class MyStack {
	    private int[] arr;
	    private int top;

	    public MyStack() {
	        arr = new int[1000];
	        top = -1;
	    }

	    public void push(int x) {
	    	top+=1;
	    	arr[top] = x;
	    	System.out.println(x);
	    }

	    public int pop() {
	    	if(top==-1)
	    		return -1;
	        int ele = arr[top];
	        top-=1;
	        return ele;
	    }
	}

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		myStack.push(2);
		myStack.push(3);
	 System.out.println(myStack.pop());
		myStack.push(4);
		 System.out.println(myStack.pop());

	}

}
