package com.xworkz.copies;
import com.xworkz.copies.init.Vehicle;

public class VehicleTester {

	public static void main(String[] args) {

		Vehicle vehicle=new Vehicle(2020,"tata",1234);
		
		int mfgDate=vehicle.getMfgDate();
		String company=vehicle.getCompany();
		int chasisNo=vehicle.getChasisNo();
		
		
		System.out.println(mfgDate);
		System.out.println(company);
		System.out.println(chasisNo);
		
		String color="Gray";
		vehicle.setColor(color);

		String ownerName="Birla";
		vehicle.setOwnerName(ownerName);
		
		
	}

}
