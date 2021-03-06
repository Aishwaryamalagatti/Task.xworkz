package com.xworkz.solution;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.solution.dto.AlcoholDTO;

public class AlcoholTester {

	public static void main(String[] args) {

		AlcoholDTO dto1=new AlcoholDTO("IB", "Imperial", 48);
		
		AlcoholDTO dto2=new AlcoholDTO("Amstel", "Kingfisher", 4);
		
		AlcoholDTO dto3=new AlcoholDTO("Magic moments", "NA", 38);
		
		AlcoholDTO dto4=new AlcoholDTO("Old Monk", "NA", 42);
		
		List<AlcoholDTO> alcoholDTOs=new ArrayList<AlcoholDTO>(100);
		alcoholDTOs.add(dto1);
		alcoholDTOs.add(dto2);
		alcoholDTOs.add(dto3);
		alcoholDTOs.add(dto4);
		
		int total=alcoholDTOs.size();
		System.out.println("total size is:"+total);
		System.out.println(alcoholDTOs);
		
		alcoholDTOs.remove(3);
		alcoholDTOs.remove(dto2);
		
		AlcoholDTO dto5=new AlcoholDTO("bud wiser", "king fisher", 8);
		alcoholDTOs.add(2, dto5);
		
		int index=alcoholDTOs.indexOf(dto5);
		System.out.println("index is:"+index);
		
		int lastIndex=alcoholDTOs.lastIndexOf(dto3);
		System.out.println("last index:"+lastIndex);
		for(AlcoholDTO alcoholDTO:alcoholDTOs) {
			System.out.println(alcoholDTO);
		}
	}

}
