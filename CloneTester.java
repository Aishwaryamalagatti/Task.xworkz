package com.xworkz.cockroach;

import com.xworkz.cockroach.dto.PlayerDTO;

public class CloneTester {

	public static void main(String[] args) {
		
		String name="Virat Kohli";
		int jersey=18;
		String sport="Cricket";
		
		
		PlayerDTO dto=new PlayerDTO();
		dto.setJerseyNo(jersey);
		dto.setName(name);
		dto.setSport(sport);
		
		System.out.println(dto.getJerseyNo());
		System.out.println(dto.getName());
		System.out.println(dto.getSport());
		
		PlayerDTO duplicate=new PlayerDTO();
		duplicate.setName(name);
		duplicate.setJerseyNo(jersey);
		duplicate.setSport(sport);
	
		
//		PlayerDTO duplicateClone=(PlayerDTO) duplicate.clone();
//		System.out.println(duplicateClone.getJerseyNo());
//		System.out.println(duplicateClone.getName());
//		System.out.println(duplicateClone.getSport());
//		
	}

}
