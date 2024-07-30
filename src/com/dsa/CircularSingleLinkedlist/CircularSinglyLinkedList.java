package com.dsa.CircularSingleLinkedlist;

public class CircularSinglyLinkedList {
	public Node last;
    public int length;
    
    public void add(Object value) {
    	Node newnode = new Node(value);
    	if (last==null) {
    		last = newnode;
    		last.next=last;
		} else {
           newnode.next=last.next;
           last.next = newnode;
           last=newnode;
		}
    	length++;
    }
    
    public void display() {
    	Node curr=last.next;
    	while (curr!=last) {
    		System.out.println(curr.data);
    		curr = curr.next;
		}
    	System.out.println(curr.data);
	}
    
    public void addNodeatFirst(Object value) {
    	Node newnode = new Node(value);
    	Node first = last.next;
    	newnode.next=first;
    	last.next=newnode;
	}
    
    public void addNodeLast(Object value) {
    	Node newnode = new Node(value);
    	newnode.next = last.next;
    	last.next = newnode;
    	last=newnode;
	}
    
    public void removeFirstNode() {
		Node first = last.next;
		if (first==null) {
			return;
		}
		if(last==first) {
			last=null;
		}else { 
		last.next=first.next;
		first.next=null;
		}
	}
    
    public void reomveLastNode() {
		Node temp = last.next;
		Node dummy = null;
		Node curr = last;
		while (temp.next!=curr && curr!=null) {
				dummy = temp;
			   temp = temp.next;
		}
		dummy.next=last.next;
		dummy.next =null;
	}
}
