package com.xworkz.cockroach;

import com.xworkz.cockroach.Event.ExceptionalEvent;

public class EventTester {

	public static void main(String[] args)throws Throwable {
		System.out.println("invoked main method");
		ExceptionalEvent event=new ExceptionalEvent();
		event.createExceptionalEvent(true);
		
		event.frame1();
	}

}
