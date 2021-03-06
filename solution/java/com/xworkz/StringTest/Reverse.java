package com.xworkz.StringTest;

public class Reverse {
	public static String reversing(String name) {
		char arr[] = name.toCharArray();
		String reverse = "";
		for (int b = arr.length - 1; b >= 0; b--) {
			reverse = reverse + arr[b];
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println(reversing("aishu"));
	}
}
