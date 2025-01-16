package com.dsa.starproblems;

public class Removeduplicatesfromasorteddoublylinkedlist {
	
	static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
		}

	}

	static class DoubleLinkedList {
		Node head;

		public void add(Node node) {
			if (head == null) {
				head = node;
			} else {
				Node temp = head;
				while (temp.next != null) {
					temp = temp.next;
				}
				node.prev = temp;
				temp.next = node;
			}
		}

		void display() {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		doubleLinkedList.add(new Node(1));
		doubleLinkedList.add(new Node(1));
		doubleLinkedList.add(new Node(1));
		doubleLinkedList.add(new Node(2));
		doubleLinkedList.add(new Node(3));
		doubleLinkedList.add(new Node(4));
		doubleLinkedList.add(new Node(4));
		
		
		Node node = removeDuplicates(doubleLinkedList.head);
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}

	}
	
	static Node removeDuplicates(Node head){
		if(head==null) return head;
       Node temp=head.next;
       Node dumy = head;
       while(temp!=null) {
    	    if(dumy.data!=temp.data) {
    	    	dumy.next=temp;
    	    	temp.prev=dumy;
    	    	dumy=dumy.next;
    	    }
    	    if(temp.next==null && dumy.data==temp.data){
 	    	   dumy.next=null;
 	       }
    	    temp=temp.next;
    	    
       }
      
        return head;
    }

}
