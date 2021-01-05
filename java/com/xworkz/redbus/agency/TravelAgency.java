package com.xworkz.redbus.agency;

import com.xworkz.redbus.contract.RedBusContract;

public class TravelAgency {

	private RedBusContract contract;
	private String agencyName = new String("Sapna travel agency");

	public TravelAgency(RedBusContract contract) {
		System.out.println("created TravelAgency");
		this.contract = contract;
	}

	public void acceptBooking() {
		System.out.println("invoked acceptBooking");
		System.out.println("checking bookings for:" + this.agencyName);
		boolean warranty = contract.busWarranty();
		if (warranty) {
			System.out.println("bus is under warranty");
			int min = contract.minBooking();
			if (min > 0 && min <= 20) {
				System.out.println("can accept booking");
			} else {
				System.out.println("cannot accept booking");
			}
		} else {
			System.out.println("bus is not under warranty");

		}

	}

}
