package com.xworkz.data.dto;

public class MobileDTO {
	private String name;
	private int price;
	private String color;
	private String size;
	private float version;
	private String model;
	private int storage;
	private int ram;

	public MobileDTO(String name, int price) {
		System.out.println("2 parameters************************");
		this.name = name;
		this.price = price;
	}

	public MobileDTO(String color, String size, String model) {
		System.out.println("3 parameters****************");
		this.color = color;
		this.size = size;
		this.model = model;
	}

	public MobileDTO(float version, int storage, int ram) {
		System.out.println("3 parameters*********************************");
		this.version = version;
		this.storage = storage;
		this.ram = ram;

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

	public void setPrice(short price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public float getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

}
