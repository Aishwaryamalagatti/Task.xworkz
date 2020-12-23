package com.xworkz.coffeeDay.appliances;

public class CoffeeMachine {

	private Power power;

	public CoffeeMachine(Power power) {
		System.out.println("init CoffeeMachine ");
		this.power = power;
	}

	public boolean grind(String bean) {
		System.out.println("invoked grind");
		if (bean != null) {
			boolean generated = this.power.generatePower();
			if (generated) {
				System.out.println("grinding " + bean);
				return true;
			} else {
				System.out.println("not grinding");
				return false;
			}
		} else {
			System.out.println("bean is not there");
			return false;
		}
	}
}
