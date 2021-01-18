package com.xworkz.cockroach.Event;

public class ExceptionalEvent {

	public ExceptionalEvent() {
		System.out.println("created ExceptionalEvent ");
	}

	public void createExceptionalEvent(boolean create) throws Throwable {
		System.out.println("invoked CreateExceptionalEvent method");
		if (create) {
			System.out.println("creating exceptional event");
			Throwable throwable = new Throwable();
			throw throwable;
		} else {
			System.out.println("no exceptional event");
		}
	}
	public void frame1() throws Throwable {
		System.out.println("frame1");
		this.frame2();
	}

	public void frame2() throws Throwable {
		System.out.println("frame2");
		this.frame3();
	}

	public void frame3() throws Throwable {
		System.out.println("frame3");
		this.frame4();
	}

	public void frame4() throws Throwable {
		System.out.println("frame4");
		this.createExceptionalEvent(true);
	}

}
