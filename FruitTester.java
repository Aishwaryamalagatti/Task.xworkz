package com.xworkz.constructors;

public class FruitTester {

	public static void main(String[] args) {

		Fruit fruitName=new Fruit();
		System.out.println(fruitName.name);
		
		Fruit fruitName2=new Fruit("Mango");
		System.out.println(fruitName2.name);
		
		//another way of printing
		
		String var=fruitName2.name;
		System.out.println(var);
		
		Fruit FruitName3=new Fruit("Apple",100);
		System.out.println(FruitName3.name);
		System.out.println(FruitName3.price);
		
		String v2=FruitName3.name;
		double pr=FruitName3.price;
		System.out.println(v2);
		System.out.println(pr);
		
	}
 
}
