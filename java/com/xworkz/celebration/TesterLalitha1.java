package com.xworkz.celebration;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.celebration.dto.FreedomFighterDTO;
import com.xworkz.celebration.dto.FreedomFighterDTO.Gender;

public class TesterLalitha1 {

	public static void main(String[] args) {

		FreedomFighterDTO dto1 = new FreedomFighterDTO("Kalam", "INDIA", Gender.MALE);

		FreedomFighterDTO dto2 = new FreedomFighterDTO("SCB", "INDIA", Gender.MALE);

		FreedomFighterDTO dto3 = new FreedomFighterDTO("KRC", "INDIA", Gender.FEMALE);

		FreedomFighterDTO dto4 = new FreedomFighterDTO("OO", "INDIA", Gender.FEMALE);

		FreedomFighterDTO dto5 = new FreedomFighterDTO("BS", "INDIA", Gender.MALE);

		Set<FreedomFighterDTO> freedomFighterDTOs = new HashSet<FreedomFighterDTO>();
		freedomFighterDTOs.add(dto1);
		freedomFighterDTOs.add(dto2);
		freedomFighterDTOs.add(dto3);
		freedomFighterDTOs.add(dto4);
		freedomFighterDTOs.add(dto5);

		System.out.println(freedomFighterDTOs.size());
		freedomFighterDTOs.forEach(f -> System.out.println(f.getName()));
	}
}
