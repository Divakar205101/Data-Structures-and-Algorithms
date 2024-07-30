package com.dsa.stack;


import java.util.NoSuchElementException;

public class StackImplArray {
	
	private Object[] array = new Object[3];
	private Integer top =-1;

	public void push(Object value) {
		if (isFull()) {
			Object[] temp = new Object[array.length+3];
			for (int i = 0; i < array.length; i++) {
				temp[i]=array[i];
			}
			array=temp;
		}
		top++;
		array[top]=value;
	}
	
	public void pop() {
		if (top==-1) {
			throw new NoSuchElementException();
		}
		System.out.println(array[top--]);
	}
	
	public boolean isFull() {
		return size()==array.length;
	}
	
	public Integer size() {
		return top+1;
	}
}
