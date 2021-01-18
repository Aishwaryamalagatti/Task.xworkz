package com.xworkz.cockroach.dto;

public class ZooDTO {
	
	private String name;
	private int noOfAnimals;
	private boolean open;
	private double entryFees;
	private boolean safari;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public double getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(double entryFees) {
		this.entryFees = entryFees;
	}

	public boolean isSafari() {
		return safari;
	}

	public void setSafari(boolean safari) {
		this.safari = safari;
	}
	
	@Override
	protected ZooDTO clone() throws CloneNotSupportedException {
		System.out.println("cloning ZooDTO");
		return (ZooDTO)super.clone();
	}


}
