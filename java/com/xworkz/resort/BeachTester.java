package com.xworkz.resort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import com.xworkz.resort.dto.BeachDTO;
import com.xworkz.resort.sort.BeachNoOfResortsComparator;

public class BeachTester {

	public static void main(String[] args) {

		BeachDTO dto1 = new BeachDTO("Om", 4, 1);

		BeachDTO dto2 = new BeachDTO("Marina", 6, 2);

		BeachDTO dto3 = new BeachDTO("Malpe", 5, 2);

		BeachDTO dto4 = new BeachDTO("Juhu", 2, 4);

		List<BeachDTO> beachDTOs = new ArrayList<BeachDTO>();
		beachDTOs.add(dto1);
		beachDTOs.add(dto2);
		beachDTOs.add(dto3);
		beachDTOs.add(dto4);

		for (BeachDTO beachDTO : beachDTOs) {
			System.out.println(beachDTO);
		}
		BeachNoOfResortsComparator brcomp = new BeachNoOfResortsComparator();
		Collections.sort(beachDTOs, brcomp);

		System.out.println("after sorting:");

		for (BeachDTO beachDTO : beachDTOs) {
			System.out.println(beachDTO);
		}
	}
}
