package com.xworkz.data;
import com.xworkz.data.dto.*;

public class SweetTester {

	public static void main(String[] args) {

		SweetDTO dto=new SweetDTO("Kaaju Katli",700);
		System.out.println(dto.getName());
		System.out.println(dto.getPrice());
		
		SweetDTO dto2=new SweetDTO("Mothichur",450,1);
		System.out.println(dto2.getName());
		System.out.println(dto2.getPrice());
		System.out.println(dto2.getQuantity());


		
	}

}
