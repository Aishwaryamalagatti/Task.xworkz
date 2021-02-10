package com.xworkz.resort.dto;

public class BeachDTO implements Comparable<BeachDTO> {

	private String name;
	private int noOfResort;
	private int icelands;

	public BeachDTO() {

	}

	public BeachDTO(String name, int noOfResort, int icelands) {
		super();
		this.name = name;
		this.noOfResort = noOfResort;
		this.icelands = icelands;
	}

	@Override
	public int compareTo(BeachDTO o) {
		System.out.println("invoked compareTo by name");
		int tempComp = this.name.compareTo(o.getName());// asc
		// int tempComp2=o.name.compareTo(this.getName());//desc
		System.out.println(tempComp);
		return tempComp;
	}

	public int compareToResort(BeachDTO o) {
		System.out.println("invoked compareToResort");

		if (this.noOfResort == o.noOfResort) {
			System.out.println("equal:" + noOfResort);
			return 0;
		}

		if (this.noOfResort > o.noOfResort) {
			System.out.println("greater:" + noOfResort);
			return 100;
		}

		if (this.noOfResort < o.noOfResort) {
			System.out.println("lesser:" + noOfResort);
			return -10;
		}
		return 0;
	}

	public String getName() {
		return name;
	}

	public int getNoOfResort() {
		return noOfResort;
	}

	public int getIcelands() {
		return icelands;
	}

	@Override
	public String toString() {
		return "BeachDTO [name=" + name + ", noOfResort=" + noOfResort + ", icelands=" + icelands + "]";
	}

}
