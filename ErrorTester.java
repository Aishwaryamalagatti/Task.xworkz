package com.xworkz.cockroach;

public class ErrorTester {

	public static void main(String[] args) {
		call();
	}

	public static void call() {
		int call = 0;
		System.out.println("called" + call);
		call++;
		call();
	}
}
