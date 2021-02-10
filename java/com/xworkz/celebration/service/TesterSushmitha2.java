package com.xworkz.celebration.service;

import java.util.HashSet;
import java.util.Set;

public class TesterSushmitha2 {

	public static void main(String[] args) {

		Set<String> favouritePlace=new HashSet<String>();
		favouritePlace.add("Paris");
		favouritePlace.add("Kerala");
		favouritePlace.add("Kutchh");
		favouritePlace.add("Italy");
		favouritePlace.add("Maldives");
		favouritePlace.add("Bora Bora");
		favouritePlace.add(null);
		favouritePlace.add("Russia");
		favouritePlace.add("Australia");
		favouritePlace.add("Korea");
		
		System.out.println(favouritePlace.size());
		favouritePlace.forEach(p->System.out.println(p));
	}
}
