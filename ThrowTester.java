package com.xworkz.cockroach;

public class ThrowTester {

	public static void main(String[] args) throws Throwable {

		Throwable event=new Throwable();
		System.out.println("event created");
		throw event;
	}

}
