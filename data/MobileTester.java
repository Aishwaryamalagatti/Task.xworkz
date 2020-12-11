package com.xworkz.data;
import com.xworkz.data.dto.*;

public class MobileTester {

	public static void main(String[] args) {

		MobileDTO dto=new MobileDTO("VIVO",10000);
				System.out.println(dto.getName());
				System.out.println(dto.getPrice());
				
				MobileDTO dto2=new MobileDTO("black","small","y51L");
				System.out.println(dto2.getColor());
				System.out.println(dto2.getSize());
				System.out.println(dto2.getModel());


				MobileDTO dto3=new MobileDTO(5.0f,16,4);
				System.out.println(dto3.getVersion());
				System.out.println(dto3.getStorage());
				System.out.println(dto3.getRam());

				
				
	}

}
