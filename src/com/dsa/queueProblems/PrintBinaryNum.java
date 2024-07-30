package com.dsa.queueProblems;


import java.util.LinkedList;
import java.util.Queue;

public class PrintBinaryNum {

	public static void main(String[] args) {
		solve(10);

	}

	public static void solve(int n) {
		String[] array = new String[n];
		Queue<String> queue = new LinkedList<>();
		queue.offer("1");
		for (int i = 0; i < n; i++) {
			array[i]=queue.poll();
			
			String n1=array[i]+"0";
			String n2=array[i]+"1";
			
			queue.offer(n1);
			queue.offer(n2);
		}
		
	     for (String string : array) {
			System.out.println(string);
		}
	}
}
