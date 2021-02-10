package com.xworkz.resort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.xworkz.resort.sort.GarageComparator;

public class SortTester {

	public static void main(String[] args) {

		List<String> garageToolList = new ArrayList();
		garageToolList.add("nut");
		garageToolList.add("bolt");
		garageToolList.add("spanner");
		garageToolList.add("screw driver");
		garageToolList.add("hammer");
		garageToolList.add("gun");
		garageToolList.add("air pipe");
		garageToolList.add("mechanic");
		garageToolList.add("jack");
		garageToolList.add("hakshaw blade");

		GarageComparator comp = new GarageComparator();
		Collections.sort(garageToolList,comp);

		for (String tools : garageToolList) {
			System.out.println(tools);

		}

	}

}
