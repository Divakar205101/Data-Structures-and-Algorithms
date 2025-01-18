package com.dsa.starproblems;

import java.util.Scanner;

public class PrintGFGntimes {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		PrintGFGntimes gntimes = new PrintGFGntimes();
		System.out.println("Enter The Count :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        gntimes.printGfg(n);
	}
	
	void printGfg(int N) {
       if(N==0)
    	   return;
       System.out.print("GFG"+" ");
       printGfg(N-1);
    }

}
