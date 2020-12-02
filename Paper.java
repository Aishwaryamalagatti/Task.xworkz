package com.xworkz.copies.init;

public class Paper {
	
	 private String brandName;
	 float width;
	 float length;
	 private String color;
	
	public Paper(String brandName,float width,float length,String color)
	{
		System.out.println("Create Paper");
		
		this.brandName=brandName;
		this.width=width;
		this.length=length;
		this.color=color;
	}

	public String getBrandName() {
		return brandName;
	}

	public float getWidth() {
		return width;
	}

	public float getLength() {
		return length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
