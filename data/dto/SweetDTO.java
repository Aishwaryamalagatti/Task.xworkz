package com.xworkz.data.dto;

public class SweetDTO {
	private String name;
	private int price;
	private int quantity;

	public SweetDTO(String name, int price) {
		System.out.println("2 parameters*****************");
		this.name = name;
		this.price = price;
	}

	public SweetDTO(String name, int price, int quantity) {
		System.out.println("3 parameters**************");
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public SweetDTO() {
		System.out.println("");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
