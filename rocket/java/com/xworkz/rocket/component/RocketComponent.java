package com.xworkz.rocket.component;

public class RocketComponent {
	
	private String fuelType;
	private String country;
	
	public RocketComponent(String fuelType, String country) {
		super();
		System.out.println("created parameterized const");
		System.out.println("In "+country+" fuel used in rocket is"+fuelType);
		this.fuelType = fuelType;
		this.country = country;
	}
	
	
}
