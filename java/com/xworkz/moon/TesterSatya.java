package com.xworkz.moon;

import java.util.Collections;

import com.xworkz.moon.dto.MenuDTO;
import com.xworkz.moon.services.Finder;
import com.xworkz.moon.services.FinderImpl;
import com.xworkz.moon.services.RestaurantService;
import com.xworkz.moon.services.RestaurantServiceImpl;
import com.xworkz.moon.services.VegFinderImpl;

public class TesterSatya {

	public static void main(String[] args) {

		RestaurantService service=new RestaurantServiceImpl();
		
		service.displayByName("sushi");
		service.displayItemGreaterThan(200);
		
		// Finder finder=new FinderImpl();
		 // finder=new VegFinderImpl();
		 
		//functional interface
		
		service.findAndDisplay(new Finder(){ 
			
			public boolean test(MenuDTO dto) {
				System.out.println("test method in tester");
				if(dto.getPrice()<200) {
					return true;
				}
				return false;
			}
		});	
		//() is required if you have more than one param
				//more than one statement
		service.findAndDisplay(d->d.getPrice()>300);
		
		//Collections.sort(menus);
	}

}
