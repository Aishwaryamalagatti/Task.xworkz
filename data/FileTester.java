package com.xworkz.data;
import com.xworkz.data.dto.*;
import java.util.Date;

public class FileTester {

	public static void main(String[] args) {

		FileDTO dto=new FileDTO();
		System.out.println(dto.getName());
		System.out.println(dto.getCreatedDate());
		
		FileDTO dto2=new FileDTO("Pictures",234);
		System.out.println(dto2.getName());
		System.out.println(dto2.getSize());
		
		Date currentDate=new Date();
		dto.setCreatedDate(currentDate);
		System.out.println(dto.getCreatedDate());
		dto.setLocation("c://Pictures");
		dto.setType("jpg");
		Date date=new Date();
		
		FileDTO dto3=new FileDTO("Image.jpg",345,"jpg","c://images",date);
		System.out.println(dto3.getName());
		System.out.println(dto3.getSize());
		System.out.println(dto3.getType());
		System.out.println(dto3.getLocation());
		System.out.println(dto3.getCreatedDate());

		
		
	}

}
