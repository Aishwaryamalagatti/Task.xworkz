package com.xworkz.celebration;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TesterSushmitha4 {

	public static void main(String[] args) {

		Set<String> places= new HashSet<String>();
		places.add("Korea");
		places.add("Paris");
		places.add("Maldives");
		places.add("Singapore");
		places.add("Amsterdam");
		System.out.println("size::"+places.size());
		places.forEach(p->System.out.println(p));
		
		System.out.println("******************************************");
		Set<String> linked=new LinkedHashSet<String>();
		
		linked.add("Kerala");
		linked.add("Munnar");
		linked.add("Goa");
		linked.add("Meghalaya");
		linked.add("Mysore");
		linked.add(null);
		linked.add(null);

		
		System.out.println("size::"+linked.size());
		linked.forEach(l->System.out.println(l));
	}

}
