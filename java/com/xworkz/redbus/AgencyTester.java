package com.xworkz.redbus;

import com.xworkz.redbus.agency.TravelAgency;
import com.xworkz.redbus.contract.RedBusContract;
import com.xworkz.redbus.vrl.RedBusContractImplementor;

public class AgencyTester {

	public static void main(String[] args) {
		RedBusContract contract=new RedBusContractImplementor();
		TravelAgency agency=new TravelAgency(contract);
		agency.acceptBooking();
		
	}

}
