package com.xworkz.copies;
import com.xworkz.copies.init.Temple;

public class TempleTester {

	public static void main(String[] args) {

		Temple temple=new Temple("God","Bglr",6.00f,"Sheera",8.00f);
		//System.out.println(temple.name);
		//System.out.println(temple.location);
		//System.out.println(temple.openTime);
		//System.out.println(temple.prasada);
		//System.out.println(temple.closeTime);
	
String name=temple.getName();
String location=temple.getLocation();
float openTime=temple.getOpenTime();
String prasada=temple.getPrasada();
float closeTime=temple.getCloseTime();

System.out.println(name);
System.out.println(location);
System.out.println(openTime);
System.out.println(prasada);
System.out.println(closeTime);

 temple.setPrasada("laadu");
prasada=temple.getPrasada();
System.out.println("update prasada:" +prasada);

	}
}
