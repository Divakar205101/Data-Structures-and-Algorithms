package com.dsa.starproblems;


public class Add1toaLinkedListNumber {

	  static int carray = 0;
	public static void main(String[] args) {
		SinglieLinkedList list = new SinglieLinkedList();
		list.add(new Node(9));
		list.add(new Node(9));
		list.add(new Node(9));
		Node addOne = optimal(list.head);
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
	
	public static Node optimal(Node head) {
		Node temp = head;
		carray = carray(temp);
		if(carray==1) {
			Node newNode=new Node(1);
			newNode.next=head;
			return newNode;
		}
		return head;
	}
	
	public static int carray(Node head) {
		if(head==null)
			return 1;
		carray = carray(head.next);
		head.val = head.val+1;
		if(head.val<10)
			return 0;
		head.val = 0;
		return carray;
	}

}
