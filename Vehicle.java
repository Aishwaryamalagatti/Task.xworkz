package com.xworkz.copies.init;

public class Vehicle {
	private int mfgDate;
	private String company;
	private int chasisNo;
	private String color;
	private String ownerName;
	
	public Vehicle(int mfgDate,String company,int chasisNo) {
		System.out.println("create vehicle");
		this.mfgDate=mfgDate;
		this.company=company;
		this.chasisNo=chasisNo;
	}

	public int getMfgDate() {
		return mfgDate;
	}

	public String getCompany() {
		return company;
	}

	public int getChasisNo() {
		return chasisNo;
	}

	public void setColor(String color) {
		this.color = color;
		System.out.println("updated color:"+ color);
		
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
		System.out.println("updated OwnerName:"+ ownerName);
	}
	
	

}
