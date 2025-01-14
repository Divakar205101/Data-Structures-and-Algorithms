package com.dsa.starproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class Findpairswithgivensumindoublylinkedlist {
	
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
		doubleLinkedList.add(new Node(2));
		doubleLinkedList.add(new Node(4));
		doubleLinkedList.add(new Node(5));
		doubleLinkedList.add(new Node(6));
		doubleLinkedList.add(new Node(7));
		doubleLinkedList.add(new Node(8));
		doubleLinkedList.add(new Node(9));
		
		ArrayList<ArrayList<Integer>> findPairsWithGivenSum = findPairsWithGivenSum(7,doubleLinkedList.head);
		System.out.println(findPairsWithGivenSum);

	}
	
	 public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
		 ArrayList<ArrayList<Integer>> res =  new ArrayList<ArrayList<Integer>>();
		       if(head==null) return res;
		       Node temp = head;
		       while(temp!=null) {
		    	     Node d = temp.next;
		    	     while(d!=null && d.data+temp.data<=target) {
		    	    	 if(d.data+temp.data==target) {
		    	    		 res.add(new ArrayList<>(Arrays.asList(temp.data,d.data))); 
		    	    	 }
		    	    	 d=d.next;
		    	     }
		    	     temp=temp.next;
		       }
		 return res;
	   }
	 
	 public static ArrayList<ArrayList<Integer>> optimal(int target,Node head){
		 ArrayList<ArrayList<Integer>> res =  new ArrayList<ArrayList<Integer>>();
          if(head==null) return res;
          Node tail = head;
          while(tail.next!=null) {
        	    tail=tail.next;
          }
          while(head.data < tail.data) {
        	   if(head.data+tail.data==target) {
        		   res.add(new ArrayList<>(Arrays.asList(head.data,tail.data))); 
        		   head=head.next;
        		   tail=tail.prev;
        	   }else if(head.data+tail.data<target) {
        		         head=head.next;
        	   }else if(head.data+tail.data>target) {
        		    tail = tail.prev;
        	   }
          }
          return res;
	 }

}
