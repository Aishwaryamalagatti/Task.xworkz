package com.xworkz.phoneBook;

import com.xworkz.phoneBook.dto.PhoneBookDTO;

public class CloneTester {

	public static void main(String[] args)throws CloneNotSupportedException {
		System.out.println("invoked main method");
		
		PhoneBookDTO dto=new PhoneBookDTO();
		dto.setName("Aishwarya");
		dto.setPincode("580021");
		dto.setPhoneNo(8176390826l);
		System.out.println(dto.getName());
		System.out.println(dto.getPhoneNo());
		System.out.println(dto.getPincode());
		
		PhoneBookDTO dto2=dto.clone;
		System.out.println(dto2.getName()+" "dto2.getPincode()+" "dto2.getPhoneNo());

	}
}
