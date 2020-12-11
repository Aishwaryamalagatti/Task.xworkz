package com.xworkz.data;
import com.xworkz.data.dto.PlayerDTO;


public class PlayerTester {

	public static void main(String[] args) {
		
		PlayerDTO dto=new PlayerDTO();
		dto.setName("Mary Kom");
		String countryName="India";
		dto.setCountry(countryName);
		String[] awardlist=new String[3];
		awardlist[0]="Arjuna";
		awardlist[1]="Drona";
		awardlist[2]="Khel Ratna";
		
		String[] sports=new String[3];
		sports[0]="Boxing";
		sports[1]="Karate";
		sports[2]="Cricket";
		
		System.out.println(dto.getName());
		System.out.println(countryName);
		System.out.println(awardlist[2]);
		System.out.println(sports[0]);
		dto.setAwards(awardlist);
		
		dto.setSports(sports);
		PlayerDTO dto2=new PlayerDTO();
		dto2.setCountry(countryName);
		dto2.setName("Virat");
		dto2.setAwards(awardlist);
		
		System.out.println(dto2.getName());
		System.out.println(awardlist[0]);
		System.out.println(countryName);
		System.out.println(sports[2]);

	}

}
