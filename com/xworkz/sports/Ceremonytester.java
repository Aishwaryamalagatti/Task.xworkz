package com.xworkz.sports;
import com.xworkz.sports.award.*;

public class Ceremonytester {

	public static void main(String[] args) {
		Ceremony ceremony=new Ceremony("agadi fest");
		System.out.println(ceremony);
		
		String[] foodItems= {"Kaaju barfi","Kulcha","Tandoori Chicken","Biryani","Butterscotch icecream"};
		
		ceremony.setFoods(foodItems);
		
		ceremony.distributeAward("Aishwarya","Oscar");
		
		ceremony.displayCeremonyNameAndFoods();
		
		ceremony.accessParentmembers();
		
		int code=ceremony.hashCode();
		System.out.println(code);
	}

}
