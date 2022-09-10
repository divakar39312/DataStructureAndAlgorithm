package com.Bridgelabz;

public class PrimeNumber {
	
	public static boolean isPrime(int n) {
		if (n < 2)
			// if n is less than 2 it will return false
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int low = 0;
		int high = 1000;
		System.out.println("Prime numbers between 0 to 1000 are ");
		// printing prime numbers till 1000
		for (int i = low; i <= high; i++)
			if (isPrime(i))
				System.out.println(i);
	}
}
