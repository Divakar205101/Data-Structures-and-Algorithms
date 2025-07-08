package com.dsa.starproblems;

import java.util.Scanner;

public class Pow {
	double d = 1;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Pow pow = new Pow();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter X value :");
		double x = scanner.nextDouble();
		System.out.println("Enter n value :");
		int n = scanner.nextInt();
		System.out.println(pow.optimal(x, n));
	}

	public double myPow(double x, int n) {
		double t = n;
		if (t < 0) {
			t = -1.0 * n;
		}
		while (t > 0) {
			if (t % 2 == 1) {
				d *= x;
				t -= 1;
			} else {
				x *= x;
				t = t / 2;
			}
		}
		if (n < 0) {
			d = (double) 1.0 / d;
		}
		return d;
	}
	
	public double optimal(double x, int n) {
		
		double ans =1.0;
	
		long nn = n;
		
		if(nn<0) nn = -1 * nn;
		
		while(nn>0) {
			
			if (nn%2==1) {
				
				ans*=x;
				nn-=1;
				
			} else {
				
				x*=x;
				
				nn=nn/2;

			}
		}
		
		if(n<0) ans = (double)1.0/(double)ans;
		
		return ans;
	}

}
