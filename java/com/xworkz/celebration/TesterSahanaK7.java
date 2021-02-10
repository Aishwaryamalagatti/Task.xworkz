package com.xworkz.celebration;

import java.util.Optional;

public class TesterSahanaK7 {

	public static void main(String[] args) {

		String email=null;
		System.out.println(email);
		
		if(email!=null) {
			System.out.println(email.toUpperCase());
		}
		Optional<String> optional= Optional.of("sahana.xworkz@gmail.com");
		
		System.out.println(optional.isPresent());
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		Optional<Integer> yrOptional=Optional.empty();
		System.out.println(yrOptional.isPresent());

		yrOptional.ifPresent((v)->System.out.println(v));
 
		Optional<String> country=Optional.ofNullable("India");
		
		country.ifPresent(p->{
			String value=country.map(String::toUpperCase).get();
			System.out.println(value);
		});
		
		String def=country.orElse("Sri lanka");
		System.out.println(def);
	
		
		
	}

}
