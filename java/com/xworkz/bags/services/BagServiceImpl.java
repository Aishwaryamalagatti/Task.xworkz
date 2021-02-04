package com.xworkz.bags.services;

import com.xworkz.bags.constants.Brand;
import com.xworkz.bags.dto.BagDTO;

public class BagServiceImpl implements BagService {
	
	public BagServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void validateAndSave(BagDTO bdto) {
		boolean validData = false;
		if (bdto != null) {
			System.out.println("dto is not null,can validate");
			String color = bdto.getColor();

			if (color != null && !color.isEmpty()) {
				System.out.println("color is valid");
				validData = true;
			} else {
				System.out.println("color is invalid");
				validData = false;
			}
		}
		if (validData) {
			double price = bdto.getPrice();
			if (price > 500 && price < 2500) {
				System.out.println("price is valid");
				validData = true;
			} else {
				System.out.println("price is invalid");
				validData = false;
			}
		}
		if (validData) {
			boolean holdLaptop = bdto.isHoldLaptop();
			if (holdLaptop) {
				System.out.println("holdLaptop is valid");
				validData = true;
			} else {
				System.out.println("price is invalid");
				validData = false;
			}
		}

	}
}
