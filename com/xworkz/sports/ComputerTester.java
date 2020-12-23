package com.xworkz.sports;

import com.xworkz.sports.award.computer.Computer;
import com.xworkz.sports.award.computer.*;

public class ComputerTester {

	public static void main(String[] args) {

		Computer computer = new Computer();
		computer.setCompanyName("HP");
		computer.setCost(25000);

		computer.displayStoring();

		Desktop desktop = new Desktop();
		// computer.displayStoring();
		System.out.println(desktop.getRam());

		Laptop laptop = new Laptop();
		laptop.moves("core i5");
		System.out.println(laptop.getProcessor());

		DellLaptop dl = new DellLaptop();
		dl.charging("Dell XPS");
		System.out.println(dl.getModel());

	}

}
