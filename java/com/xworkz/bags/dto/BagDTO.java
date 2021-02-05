package com.xworkz.bags.dto;

import com.xworkz.bags.constants.Brand;

public class BagDTO {
	
	private Brand brand;
	private String color;
	private Double price;
	private boolean holdLaptop;
	
	public BagDTO() {
		// TODO Auto-generated constructor stub
	}

	public BagDTO(Brand brand, String color, Double price, boolean holdLaptop) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.holdLaptop = holdLaptop;
	}
	
	@Override
	public String toString() {
		return "BagDTO [brand=" + brand + ", color=" + color + ", price=" + price + ", holdLaptop=" + holdLaptop + "]";
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean isHoldLaptop() {
		return holdLaptop;
	}

	public void setHoldLaptop(boolean holdLaptop) {
		this.holdLaptop = holdLaptop;
	}
}
