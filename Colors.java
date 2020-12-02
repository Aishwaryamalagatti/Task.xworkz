package com.xworkz.constructors;

public class Colors {
	
	public String name;
	public String type;
	public double depth;
	public int percent;
	public boolean color;
	
	public Colors() {
		System.out.println("default constructor");
	}
	public Colors(String name) {
		System.out.println("1 parameter");
		this.name=name;
	}
	public Colors(String name,String type) {
		System.out.println("2 parameters");
		this.name=name;
		this.type=type;
	}
	public Colors(String type,double depth) {
		System.out.println("2 diff parameters");
		this.type=type;
		this.depth=depth;
	}
	public Colors(int percent,boolean color) {
		System.out.println("description");
		this.percent=percent;
		this.color=color;
	}

}
