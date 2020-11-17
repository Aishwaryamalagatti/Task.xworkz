package com.xworkz.OnlinePgm;

public class HotelMenu {
	private static String[] foodItems = {"Dosa","Idli","Upma","Puri","vada","IceCream","Juice"};
	public static void search(String item) {
		System.out.println("search kareyuvudu");
		System.out.println("Total foodItems available" + foodItems.length);
		System.out.println("arg1 :" + item);
		boolean itemsFound = false;
		for (int count = 0; count < foodItems.length; count++) {
			//System.out.println("bus at position " + items[count]);
			String items = foodItems[count];
			if (items.equals(item)) {
				
				itemsFound = true;
				break;
			} else {
				
				itemsFound = false;
			}

		}

		if (itemsFound) {
			System.out.println("Food Item is found ");
		} else {
			System.out.println("Food Item is not found");
		}
		System.out.println("search nirgamana");

	}

	public static int totalfoodItems() {
		return foodItems.length;
	}


}
