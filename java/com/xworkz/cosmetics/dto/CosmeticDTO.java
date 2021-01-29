package com.xworkz.cosmetics.dto;

import com.xworkz.cosmetics.constants.CosmeticShades;
import com.xworkz.cosmetics.constants.CosmeticType;

public class CosmeticDTO {

	private String brand;
	private double price;
	private int quantity;
	private CosmeticType type;
	private CosmeticShades shade;

	public CosmeticDTO() {
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public CosmeticType getType() {
		return type;
	}

	public void setType(CosmeticType type) {
		this.type = type;
	}

	public CosmeticShades getShade() {
		return shade;
	}

	public void setShade(CosmeticShades shade) {
		this.shade = shade;
	}

	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", price=" + price + ", quantity=" + quantity + ", type=" + type
				+ ", shade=" + shade + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
				
		if (obj instanceof CosmeticDTO) {
			CosmeticDTO converted = (CosmeticDTO) obj;
			if (this.brand != null && this.type != null) {
				if (converted.equals(this.brand) && converted.equals(this.type)) {
					System.out.println("CosmecticDTO is equal");
				}
					return true;
			}
		}
		System.out.println("CosmecticDTO is not equal");
		}
		return false;
	}
	
	

	public CosmeticDTO(String brand, double price, int quantity, CosmeticType type, CosmeticShades shade) {
		super();
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
		this.shade = shade;
	}
	
}
