package com.xworkz.basics;

public class InfoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName="Xworkz";
		
		System.out.println(firstName);
		
		String lastName="odc";
		System.out.println(lastName);
		String fullName=firstName+lastName;
		System.out.println(fullName);
		String partName=fullName.substring(4);
		System.out.println(partName);
		
		String concatinated=partName.concat("Dev Center");
		System.out.println(concatinated);

	}

}
