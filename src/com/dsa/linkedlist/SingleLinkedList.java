package com.dsa.linkedlist;

import java.util.ArrayList;

public class SingleLinkedList {

	private ListNode first = null;
	private Integer count =0;
	
	public void add(Object object) {
		if(first==null) {
			first = new ListNode(object);
			count++;
			return;
		}
		ListNode current = first;
		while (current.next!=null) {
			current = current.next;
		}
		current.next = new ListNode(object);
		count++;
	}
	
	public Integer size() {
		return count;
	}
	
	public void show() {
		ListNode pressent = first;
		while(pressent!=null) {
			System.out.println(pressent.data);
			pressent = pressent.next;
		}
	}
	
	public void addFirst(Object object) {
		ListNode temp = first;
		first = new ListNode(object);
		first.next = temp;
	}
	
	public void addLast(Object object) {
		ListNode current = first;
		while (current.next!=null) {
			current = current.next;
		}
		current.next = new ListNode(object);
	}
	
	public void add(int index,Object object) {
		if(index< 0 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first = new ListNode(object,first);
			count++;
			return;
		}
		ListNode temp = first;
		for (int i = 1; i <index; i++) {
			temp = temp.next;
		}
		temp.next = new ListNode(object,temp.next);
		count++;
	}
	
	public void removeFirst() {
		ListNode temp = first;
		if(temp==null) {
			return;
		}
		first=first.next;
		temp.next=null;
	}
	
	public void removeLast() {
		if(first==null || first.next==null) {
			return;
		}
		ListNode current = first;
		ListNode previous = null;
		while(current.next!=null) {
			previous = current;
			current =current.next;
		}
		previous.next=null;
	}
	
	public void removeAt(Integer index) {
		ListNode previous = first;
		if(index>size() || index<0) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
		}else {
		for(int i=1;i<index;i++) {
			previous = previous.next;
		}
		ListNode current=previous.next;
		previous.next=current.next;
		}
	}
	
	public void reverse() {
		ListNode current=first;
		ListNode previous=null;
		ListNode next=null;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
		    current=next;	
		}
		first=previous;
	}
	
	public Object findMidelement() {
		ListNode slowpointer = first;
		ListNode fastpointer = first;
		while (fastpointer!=null&&fastpointer.next!=null) {
			slowpointer = slowpointer.next;
			fastpointer=fastpointer.next.next;
		}
		return slowpointer.data;
	}
	
	public Integer findNthvalueFromLast(Integer n) {
		ListNode mainpointer = first;
		ListNode currpointer = first;
		int count =0;
		while(count<n) {
			currpointer = currpointer.next;
			count++;
		}
		while (currpointer!=null) {
			currpointer=currpointer.next;
			mainpointer=mainpointer.next;
		}
		return (Integer) mainpointer.data;
	}
	
	public void removedulicates() {
		ListNode currentNode = first;
		while (currentNode!=null&&currentNode.next!=null) {
			if(currentNode.data==currentNode.next.data) {
				currentNode.next = currentNode.next.next;
			}else {
				currentNode = currentNode.next;
			}
		}
	}
	
	public void removeMidleNode() {
		ListNode fastpointer = first;
		ListNode slowpointer = first;
		ListNode previous= first;
		while (fastpointer!=null&&fastpointer.next!=null) {
			previous =slowpointer;
			slowpointer = slowpointer.next;
			fastpointer=fastpointer.next.next;
		}
		 previous.next=slowpointer.next;
	}
	
	public void insetNodeSortedList(Integer value) {
		ListNode current = first;
		ListNode temp = null;
		while (current!=null && (Integer)current.data<value) {
			temp = current;
			current = current.next;
		}
		temp.next = new ListNode(value, current);
	}
	
	public void removegivenKey(Integer value) {
		ListNode current = first;
		ListNode temp = null;
		if (first.data==value) {
			first = first.next;
			return;
		}
		while (current!=null && (Integer)current.data!=value) {
			temp = current;
			current = current.next;
		}
		temp.next = current.next;
	}
	
	public ListNode oddEvenListApprochOne() {
		ListNode odd = first;
		ListNode even = first.next;
		ListNode evenhead = even;
		while (even!=null && even.next!=null) {
			  odd.next=odd.next.next;
			  even.next=even.next.next;
			  odd=odd.next;
			  even=even.next;
		}
		odd.next = evenhead;
		return first;
    }
	
	 public ListNode oddEvenList() {
		 ListNode head =  first;
	        if(head==null || head.next==null) return head;
	        
	        ListNode oddHead = null, oddTail = null;
	        ListNode evenHead = null, evenTail = null;
	        ListNode curr = head;
	        int i = 1;
	        while(curr!=null){
				// generate the odd indices list
	            if(i%2==1){
	                if(oddHead==null){
	                    oddHead = curr;
	                    oddTail = curr;
	                }
	                else{
	                    oddTail.next = curr;
	                    oddTail = oddTail.next;
	                }
	            }
				// generate the even indices list
	            else{
	                if(evenHead==null){
	                    evenHead = curr;
	                    evenTail = curr;
	                }
	                else{
	                    evenTail.next = curr;
	                    evenTail = evenTail.next;
	                }
	            }
	            curr = curr.next;
	            i++;
	        }
	        
	        evenTail.next = null;     // there should not be any node after even tail
	        oddTail.next  = evenHead;   // join even list after odd
	        return oddHead;
	    
	    }
	 
	 public Integer maxtwinSumOfLinkedList() {
		 ListNode curr = first;
		 ArrayList<Integer> arrayList = new ArrayList<>();
		 while (curr!=null) {
			 arrayList.add((Integer)curr.data);
			 curr =curr.next;
		}
		 int i=0;
		 int j=arrayList.size()-1;
		 int minnum = Integer.MIN_VALUE;
		 while (i<j) {
			int sum = arrayList.get(i)+arrayList.get(j);
			if (sum>minnum) {
				minnum = sum;
			}
			i++;
			j--;
		}
		return minnum;
	}
}
