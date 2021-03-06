package com.xworkz.StringTest;

public class Palindrome {

	static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "Aishu";

		if (isPalindrome(str)) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is  not palindrome");
		}
	}
}
