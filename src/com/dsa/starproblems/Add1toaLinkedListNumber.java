package com.dsa.starproblems;


public class Add1toaLinkedListNumber {

	public static void main(String[] args) {
		SinglieLinkedList list = new SinglieLinkedList();
		list.add(new Node(9));
		list.add(new Node(9));
		list.add(new Node(9));
		Node addOne = addOne(list.head);
		while(addOne!=null) {
			System.out.println(addOne.val);
			addOne = addOne.next;
		}
	}
	
	public static Node addOne(Node head) {
		 if(head==null) return null;
		 head = reverse(head);
		 Node temp = head;int carry = 1;
		  while(temp!=null) {
			  int currval = temp.val+carry;
			  if (currval==10) {
				  temp.val = 0;
			} else {
				temp.val = currval; 
				carry=0;
				break;
			}
			  temp = temp.next;
		  }
		  if(carry==1) {
			  head = reverse(head);
			  Node newNode = new Node(1);
			  newNode.next=head;
			  return newNode;
		  }else {
			  head = reverse(head);
			  return head;
		  }
		
	}
	
	
	
	public static Node reverse(Node head) {
		 Node curr=head;
		 Node next = head;
		 Node prev=null;
		 while(curr!=null) {
			 next = curr.next;
			 curr.next = prev;
			 prev=curr;
			 curr = next;
		 }
		 return prev;
	}

}
