package com.xworkz.cockroach;

import com.xworkz.cockroach.Event.PlayerService;
import com.xworkz.cockroach.dto.PlayerDTO;

public class ExceptionTester {

	public static void main(String[] args) {
		
		PlayerService play =new PlayerService();
		
		PlayerDTO dto=new PlayerDTO();
		play.showDetails(dto);
	}

}
