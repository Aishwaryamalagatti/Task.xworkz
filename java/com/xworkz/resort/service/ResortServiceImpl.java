package com.xworkz.resort.service;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dto.ResortDTO;

public class ResortServiceImpl implements ResortService {

	private ResortDAO dao;

	public ResortServiceImpl(ResortDAO dao) {
		System.out.println("created ResortServiceImpl");
		this.dao = dao;
	}

	@Override
	public void validatAndSave(ResortDTO dto) {
		boolean validData = false;
		if (dto != null) {
			System.out.println("dto is not null,its valid");
			String name = dto.getName();

			if (name != null && name.length() >= 3 && name.length()<=15 && !name.isEmpty()) {
				System.out.println("name is valid");
				validData = true;
			} else {
				System.out.println("name is invalid");
				validData = false;
			}
		}
		if (validData) {
			String location = dto.getLocation();
			if (location.length() > 3 && location.length() < 15) {
				System.out.println("location is valid");
				validData = true;
			} else {
				System.out.println("location is invalid");
				validData = false;
			}
		}
		if (validData) {
			double pricePerHead = dto.getPricePerHead();
			if (pricePerHead > 999 && pricePerHead < 2500) {
				System.out.println("pricePerHead is valid");
				validData = true;
			} else {
				System.out.println("pricePerHead is invalid");
				validData = false;
			}
		}
		if (validData) {
			float rating = dto.getRating();
			if (rating >= 0 && rating <= 5) {
				System.out.println("rating is valid");
				validData = true;
			} else {
				System.out.println("rating is invalid");
				validData = false;
			}
		}

		if (validData) {
			long phoneNo = dto.getPhoneNo();
			if (phoneNo >= 10) {
				System.out.println("phoneNo is valid");
				validData = true;
			} else {
				System.out.println("phoneNo is invalid");
				validData = false;
			}

		}

		if (validData) {
			boolean offers = dto.getOffers();
			if (offers) {
				System.out.println("offers is valid");
				validData = true;
			} else {
				System.out.println("offers is invalid");
				validData = false;
			}

		}
		if (validData) {
			String managerName = dto.getManagerName();
			if (managerName.length() > 3 && managerName.length() < 12) {
				System.out.println("managerName is valid");
				validData = true;
			} else {
				System.out.println("managerName is invalid");
				validData = false;
			}

		}
		if (validData) {
			int noOfEmployees = dto.getNoOfEmployees();
			if (noOfEmployees > 5 && noOfEmployees < 25) {
				System.out.println("noOfEmployees is valid");
				validData = true;
			} else {
				System.out.println("noOfEmployees is invalid");
				validData = false;
			}
		}
	}
}
