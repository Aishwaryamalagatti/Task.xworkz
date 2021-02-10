package com.xworkz.moon.dto;

public class MenuDTO {

	private String itemname;
	private double price;
	private Type type;

	public enum Type {
		VEG, NON_VEG,
	}

	public MenuDTO(String itemname, double price, Type type) {
		super();
		this.itemname = itemname;
		this.price = price;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "MenuDTO [itemname=" + itemname + ", price=" + price + ", type=" + type + "]";
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}
