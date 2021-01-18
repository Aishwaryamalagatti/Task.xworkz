package com.xworkz.cockroach.Event;

import com.xworkz.cockroach.dto.PlayerDTO;

public class PlayerService {

	public void showDetails(PlayerDTO dto) {
		String name = null;
		int jerseyNo = 0;
		String sport = null;

		try {
			System.out.println("start of try");
			name = dto.getName();
			jerseyNo = dto.getJerseyNo();
			sport = dto.getSport();
			System.out.println("end of try");
		} catch (NullPointerException np) {
			System.out.println("this is catching NullPointerException ");
		}

		System.out.println(name);
		System.out.println(jerseyNo);
		System.out.println(sport);
	}
}
