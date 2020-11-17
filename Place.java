package com.xworkz.OnlinePgm;

public class Place {
	private static String[] places = {"Banglore","Mysore","Gadag","Hubli","Koppal","Belagavi"};
	public static void search(String bus) {
		System.out.println("search kareyuvudu");
		System.out.println("Total places available" + places.length);
		System.out.println("arg1 :" + bus);
		boolean busesFound = false;
		for (int count = 0; count < places.length; count++) {
			//System.out.println("bus at position " + items[count]);
			String buses = places[count];
			if (buses.equals(bus)) {
				// System.out.println("bus is found");
				busesFound = true;
				break;
			} else {
				// System.out.println("bus is not found");
				busesFound = false;
			}

		}

		if (busesFound) {
			System.out.println("bus is found ");
		} else {
			System.out.println("bus is not found");
		}
		System.out.println("search nirgamana");

	}

	public static int totalplaces() {
		return places.length;
	}


}
