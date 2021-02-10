package com.xworkz.resort.sort;

import java.util.Comparator;

import com.xworkz.resort.dto.BeachDTO;

public class BeachNoOfResortsComparator implements Comparator<BeachDTO> {

	@Override
	public int compare(BeachDTO o1, BeachDTO o2) {
		Integer No1=o1.getNoOfResort();
		Integer No2=o2.getNoOfResort();
		return No2.compareTo(No1);
	}
	
	

}
