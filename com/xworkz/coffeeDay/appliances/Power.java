package com.xworkz.coffeeDay.appliances;

public class Power {
	private int voltage = 0;

	public Power() {
		System.out.println("init power");
	}

	public boolean generatePower() {
		this.voltage = 200;
		return true;
	}
}
