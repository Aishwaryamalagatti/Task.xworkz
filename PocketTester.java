package com.xworkz.basics;

public class PocketTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("JVM invoked main");
		PocketMoneyEstimator.request(30,  "Monday");
		PocketMoneyEstimator.request(50,  "Friday");
		
		PocketMoneyEstimator.Expenditure(40);
		System.out.println(PocketMoneyEstimator.getTotalAmount());
		PocketMoneyEstimator.Expenditure(30);
		System.out.println(PocketMoneyEstimator.getTotalAmount());
		
		System.out.println("Exit:: main");
	}

}
