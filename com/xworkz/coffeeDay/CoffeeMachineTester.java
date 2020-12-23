package com.xworkz.coffeeDay;
import com.xworkz.coffeeDay.appliances.*;

public class CoffeeMachineTester {

	public static void main(String[] args) {
CoffeeMachine machine=new CoffeeMachine(new Power());

boolean success=machine.grind("Civet");
if(success) {
	System.out.println("grinding was done");
}
else {
	System.out.println("grinding was not done");
}
	}
}
