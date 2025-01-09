package com.dsa.starproblems;

class ListNode {

	int val;
	ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		super();
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		super();
		this.val = val;
		this.next = next;
	}

}

class SigleLinkedList {
	ListNode head;
	
	public void add(ListNode node) {
		if(head==null) {
			head = node;
		}else {
			ListNode curr=head;
			while(curr.next!=null)
				  curr = curr.next;
			
			curr.next = node;
		}
	}
	
	void getAll() {
		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}

public class SortLinkedList {

	public static void main(String[] args) {
		SigleLinkedList list = new SigleLinkedList();
		list.add(new ListNode(4));
		list.add(new ListNode(2));
		list.add(new ListNode(1));
		list.add(new ListNode(3));
		ListNode sortList = sortList(list.head);
		while (sortList!=null) {
			System.out.println(sortList.val);
			sortList = sortList.next;
		}
	}
	
	 public static ListNode sortList(ListNode head) {
		 ListNode mid=null,left=null,right=null;
	        if(head==null || head.next==null)
	        	return head;
	         mid = findMid(head);
	         left = head;
	         right=  mid.next;
	         mid.next=null;
	         left = sortList(left);
	         right = sortList(right);
	         return merge(left, right);
	        
	  }
	
	public static ListNode findMid(ListNode head) {
		ListNode slow = head;
		ListNode fast = head.next;
		while(fast!=null && fast.next!=null) {
			  slow = slow.next;
			  fast=fast.next.next;
		}
		return slow;
	}
	
	public static ListNode merge(ListNode left,ListNode right) {
		ListNode dummy = new ListNode(-1);
		ListNode temp = dummy;
		while(left!=null && right!=null) {
			  if(left.val<right.val) {
				  temp.next=left;
				  temp=left;
				  left=left.next;
			  }else {
				  temp.next=right;
				  temp=right;
				  right=right.next;
			  }
		}
		while(left!=null) {
			 temp.next=left;
			 temp=left;
			 left=left.next;
		}
		while(right!=null) {
			temp.next=right;
			temp=right;
			right=right.next;
		}
		return dummy.next;
	}

}
