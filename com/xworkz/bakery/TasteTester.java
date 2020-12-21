package com.xworkz.bakery;

import com.xworkz.bakery.cake.*;

public class TasteTester {

	public static void main(String[] args) {

		Cake cake = new Cake();
		cake.setFlavour("vanilla");
		cake.setShape("round");
		cake.setSize(1.5);
		System.out.println(cake.getFlavour());
		System.out.println(cake.getShape());
		System.out.println(cake.getSize());
		
		HoneyCake honey=new HoneyCake();
		honey.setFlavour("butterscotch");
		honey.setShape("square");
		honey.setSize(2.0);
		System.out.println(honey.getFlavour());
		System.out.println(honey.getShape());
		System.out.println(honey.getSize());

	}
	
}
