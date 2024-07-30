package com.dsa.stack;

import java.util.NoSuchElementException;

public class Stack {
   
	public Node top=null;
   public Integer count=0;
   
   public void push(Object data) {
	   Node temp = new Node(data);
	   temp.next=top;
	   top=temp;
	   count++;
   }
   
   public Integer size() {
	return count;
   }
   
   public void pop() {
	if (top==null) {
		throw new NoSuchElementException();
	}
	System.out.println(top.data);
	top = top.next;
	count--;
   }
   
   public void add(Object data) {
	   Integer top=-1;
	   Object[] object= new Object[3];
	   if (top==-1) {
		   object[0]=data;
	   }else {
		   top++;
		   object[top]=data;
		   if (top>object.length) {
			   Object[] temp= new Object[object.length];
			   temp = object;
			   object = temp;
		}else {
			
		}
	   }
   }
}
