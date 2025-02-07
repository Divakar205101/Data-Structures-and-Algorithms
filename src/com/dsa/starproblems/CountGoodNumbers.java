package com.dsa.starproblems;

import java.util.Scanner;

public class CountGoodNumbers {
	static int mod = (int) 1e9 + 7;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the value of n::");
			int nextInt = sc.nextInt();
			int numbers = CountGoodNumbers.countGoodNumbers(nextInt);
			System.out.println(numbers);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static int countGoodNumbers(long n) {
		long first = (n % 2 == 0 ? n / 2 : (n / 2) + 1);
		long second = n / 2;
		long l = power(5, first) % mod;
		long m = power(4, second) % mod;
		long ans = 1;
		ans = (ans * l) % mod;
		ans = (n / 2 != 0) ? (ans * m) % mod : ans;
		return (int) (ans % mod);
	}

	public static long power(long x, long n) {
		long temp = 1;
		if (n == 0)
			return 1;
		temp = power(x, n / 2);
		if (n % 2 == 0)
			return (temp * temp) % mod;
		else
			return (temp * temp * x) % mod;
	}

}
