package com.xworkz.celebration.service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.celebration.functional.Display;

public class DisplayServiceImpl implements DisplayService {

	private List<String> names;

	public DisplayServiceImpl() {
		this.names = new ArrayList<String>();
		this.names.add("SCB");
		this.names.add("BS");
		this.names.add("KRC");
		this.names.add("OO");
		this.names.add("Kalam");
		this.names.add("BS");
	}

	@Override
	public void printString(Display display) {
		for (String string : names) {
			display.print(string, "Indian");
		}
	}
}