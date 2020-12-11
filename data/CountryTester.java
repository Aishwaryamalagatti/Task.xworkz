package com.xworkz.data;
import java.util.Arrays;

import com.xworkz.data.dto.*;

public class CountryTester {

	public static void main(String[] args) {

		CountryDTO dto=new CountryDTO();
		System.out.println(dto.getName());
		System.out.println(dto.getContinent());
		
		CountryDTO dto2=new CountryDTO("India","Asia");
		System.out.println(dto2.getName());
		System.out.println(dto2.getContinent());		
		
		CountryDTO dto3=new CountryDTO(1380004385,"Modi","Ram Nath Kovind");
		System.out.println(dto3.getPopulation());
		System.out.println(dto3.getPrimeMinister());
		System.out.println(dto3.getPresident());
		//small ref
		String[] AllLanguages=new String[5];
		AllLanguages[0]="Hindi";
		AllLanguages[1]="Kannada";
		AllLanguages[2]="Telugu";
		AllLanguages[3]="Marathi";
		AllLanguages[4]="Malayalam";
		
		String[] AllStates=new String[5];
		AllStates[0]="Maharashtra";
		AllStates[1]="Karnataka";
		AllStates[2]="Andra Pradesh";
		AllStates[3]="Belgaum";
		AllStates[4]="Kerala";

		CountryDTO dto4=new CountryDTO(AllLanguages,AllStates);
		System.out.println(Arrays.toString(AllLanguages));
		System.out.println(Arrays.toString(AllStates));

		CountryDTO dto5=new CountryDTO("Germany","Europe",83902518,"Angela D Merkel","Frank-Walter Steinmeier");
		System.out.println(dto5.getName());
		System.out.println(dto5.getContinent());
		System.out.println(dto5.getPopulation());
		System.out.println(dto5.getPrimeMinister());
		System.out.println(dto5.getPresident());

		
	}

}
