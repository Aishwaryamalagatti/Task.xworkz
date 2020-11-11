package com.xworkz.basics;

public class PocketMoneyEstimator {
	
	private static double totalAmount;
	
	public static void request(double amount,String day) {
		System.out.println("Invoked request");
		System.out.println("arg 1, amount:" + amount);
		System.out.println("arg 2, day:" + day);
		
		totalAmount=totalAmount+amount;
		System.out.println("Total amount after request:" + totalAmount);
		System.out.println("Exit:: request");
		
		}
	public static void Expenditure(double amount) {
		System.out.println("Invoked expenditure");	
		System.out.println("arg 1, amount:" + amount);
		totalAmount=totalAmount-amount;
		System.out.println("Total amount after expenditure:" + totalAmount);
		System.out.println("Exit:: expenditure");
	}
	public static double getTotalAmount()
	{
		return totalAmount;
	}

}
