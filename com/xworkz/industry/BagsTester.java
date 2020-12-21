package com.xworkz.industry;
import com.xworkz.industry.bags.*;

public class BagsTester {

	public static void main(String[] args) {
		SkyBags bags=new SkyBags();
		bags.carrying();
		bags.setColor("black");
		bags.setSize("small");
		bags.setPrice(1000);

		System.out.println(bags.getColor());
		System.out.println(bags.getSize());
		System.out.println(bags.getPrice());
		
		AmericanTourister bags2=new AmericanTourister();
		bags2.carrying();
		bags2.setColor("blue");
		bags2.setSize("large");
		bags2.setPrice(2500);
		bags2.type="trolly";
		
		
		System.out.println(bags2.getColor());
		System.out.println(bags2.getSize());
		System.out.println(bags2.getPrice());
		System.out.println(bags2.type);
	}

}
