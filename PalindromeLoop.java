/**
 * Program: Palindrome Loop
 * File: PalindromeLoop.java
 * Summary: Programs loops and displays palindromic prime numbers
 * Author: Pearl Jomalon
 * Date: October 21, 2018
 */
public class PalindromeLoop {
	
	public static void main(String[] args) {
		String palPrime = "";
		int newLineCount = 0;
		
		for(int i = 1; i <= 10000; i++) {
			if(isPrime(i) && isPalindrome(i)) {
				palPrime += Integer.toString(i) + "\t";
						newLineCount++;
			}
			
			if (newLineCount == 4) {
				palPrime += "\n";
				newLineCount = 0;
			}
		}
		System.out.println("Palindromic Primes");
		System.out.println(palPrime);
	}
	
	public static boolean isPrime(int n) {
		
		if (n < 2) {
			return false;
		}
		
		if (n == 2) {
			return true;
		}
		
		if (n % 2 == 0)
			return false;
		
		for(int i=3; i * i <= n; i +=2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isPalindrome (int n) {
		int pal = n;
		int reverse = 0;
		
		while (pal != 0) {
			int remainder = pal % 10;
			reverse = reverse * 10 + remainder;
			pal = pal / 10;
		}
		
		if (n == reverse) {
			return true;
		}
		
	return false;
	}

}
