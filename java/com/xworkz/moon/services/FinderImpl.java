package com.xworkz.moon.services;

import com.xworkz.moon.dto.MenuDTO;
import com.xworkz.moon.dto.MenuDTO.Type;

public class FinderImpl implements Finder {

	@Override
	public boolean test(MenuDTO dto) {
		System.out.println("invoked test method ");
		if(dto!=null && dto.getType().equals(Type.VEG)) {
			return true;
		}
		return false;
	}

}
