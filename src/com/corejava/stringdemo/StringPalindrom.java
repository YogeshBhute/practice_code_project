package com.corejava.stringdemo;

import java.util.Scanner;

public class StringPalindrom {
	
	

	public boolean isPalindrome(String str) {
		String reverse = "";
		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);
		}
		if (str.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		StringPalindrom palindrome = new StringPalindrom();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();

		if (palindrome.isPalindrome(str) == true) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
