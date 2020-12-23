package com.xworkz.sports.award.computer;
import com.xworkz.sports.award.computer.*;

public class Laptop extends Computer{
	
	private String processor;
	
	public void moves(String processor) {
		System.out.println("created moves");
		this.processor=processor;
	}

	public String getProcessor() {
		return processor;
	}	
	

}
