package com.xworkz.basics;

public class CreditCardEstimator {
	private static double totalAmount;
	public static void expenditure(double amount) {
		System.out.println("invoked request");
		System.out.println("arg 1 amount:" +amount);
		
		totalAmount=totalAmount-amount;
		System.out.println("total amount after expenditure is:"+totalAmount);
		System.out.println("Exit:: request");
	}
		public static void amount(double amount) {
			
		if(amount<=1000) {
			System.out.println("Total amount is below 1000,so proceed");
		}
			else {
				System.out.println("max expenditure is 1000");
			}
	}
		public static double getTotalAmount()
		{
			return totalAmount;
				
			}
	}
