package com.xworkz.constructors;

public class Fruit {

	public String name;
	public double price;
	
public Fruit(){
	System.out.println("default constructor");
}
public Fruit(String name) {
	System.out.println("using parameter");
	this.name=name;
}

public Fruit(String name,double price) {
	System.out.println("using 2 parameter");
	this.name=name;
	this.price=price;
	
}
}
