package com.gfg.dailyproblem;

import java.util.ArrayList;

public class DecimalToBinary {

	public static void main(String[] args) {
		binaryString(10);
	}
    public static void binaryString(int n) {
    	
    	for (int i = 31; i >= 0; i--) { 
			int k = n >> i; 
			if ((k & 1) > 0) 
				System.out.print("1");
			else
				System.out.print("0");
		} 
    	
    	
    }
}
