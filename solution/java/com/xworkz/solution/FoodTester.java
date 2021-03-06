package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;

public class FoodTester {

	public static void main(String[] args) {

		String indian="Paratha";
		String chinese="Noodles";
		String american="pizza";
		String italian="pasta";
		String greece="pancakes";
		
		Collection<String> items=new ArrayList();
		items.add(indian);
		items.add(chinese);
		items.add(american);
		items.add(italian);
		items.add(greece);
	
		int totalNo=items.size();
		System.out.println("Total Mobile numbers "+totalNo);
		System.out.println(items);
		
		boolean food=items.contains(indian);
		System.out.println(food+":Food Item is present ");
		
	}

}
