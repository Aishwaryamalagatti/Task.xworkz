package com.xworkz.basics;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String countryName="India";
		System.out.println("country is:" +countryName);
		int sizeOfCountryName=countryName.length();
		System.out.println(sizeOfCountryName);
		countryName=countryName.toUpperCase();
		System.out.println(countryName);
		countryName=countryName.toLowerCase();
		System.out.println(countryName);
		char alphabet=countryName.charAt(2);
		System.out.println(alphabet);

	}

}
