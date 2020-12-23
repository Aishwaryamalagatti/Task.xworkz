package com.xworkz.sports.award.computer;

import com.xworkz.sports.constants.OperatingSystem;

public class Computer {

	private String companyName;
	private double cost;
	private OperatingSystem OperatingSystem;

	public void storing() {
		System.out.println("created storing");
	}

	public void displayStoring() {
		System.out.println(this.companyName);
		System.out.println(this.cost);
		System.out.println(this.OperatingSystem.WINDOWS);
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public OperatingSystem getOperatingSystem() {
		return OperatingSystem;
	}

	public void setOperatingSystem(OperatingSystem operatingSystem) {
		OperatingSystem = operatingSystem;
	}

}
