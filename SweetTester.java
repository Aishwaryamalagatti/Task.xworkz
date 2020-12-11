package com.xworkz.data;
import com.xworkz.data.constants.Shape;
import com.xworkz.data.dto.*;
import java.util.Arrays;
public class SweetTester {

	public static void main(String[] args) {

		SweetDTO dto=new SweetDTO("Kaaju Katli",700);
		System.out.println(dto.getName());
		System.out.println(dto.getPrice());
		
		String[] color=new String[2];
		color[0]="Orange";
		color[1]="Yellow";
				
		SweetDTO dto2=new SweetDTO("Mothichur",450,1);
		System.out.println(dto2.getName());
		System.out.println(dto2.getPrice());
		System.out.println(dto2.getQuantity());

		SweetDTO dto3=new SweetDTO("ladoo",color,Shape.ROUND);
		System.out.println(dto3.getName());
		System.out.println(Arrays.toString(color));
		System.out.println(dto3.getShape());

		
	}

}
