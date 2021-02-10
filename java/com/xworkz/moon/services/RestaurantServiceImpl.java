package com.xworkz.moon.services;

import java.util.LinkedList;
import java.util.List;
import com.xworkz.moon.dto.MenuDTO;
import com.xworkz.moon.dto.MenuDTO.Type;

public class RestaurantServiceImpl implements RestaurantService {

	private List<MenuDTO> menus;

	public RestaurantServiceImpl() {
		this.menus = new LinkedList<MenuDTO>();
		MenuDTO menu1 = new MenuDTO("Brownie", 200, Type.VEG);
		MenuDTO menu2 = new MenuDTO("Sushi", 400, Type.NON_VEG);
		MenuDTO menu3 = new MenuDTO("Lemon Chicken", 350, Type.NON_VEG);
		MenuDTO menu4 = new MenuDTO("Paneer Masala", 250, Type.VEG);

		this.menus.add(menu1);
		this.menus.add(menu2);
		this.menus.add(menu3);
		this.menus.add(menu4);

	}

	@Override
	public void displayItemGreaterThan(double price) {
		for (MenuDTO menuDTO : menus) {
			if (menuDTO.getPrice() >= price) {
				System.out.println(menuDTO);
			}
		}
	}

	@Override
	public void displayByName(String name) {
		for (MenuDTO menuDTO : menus) {
			if (menuDTO.getItemname().equals(name)) {
				System.out.println(menuDTO);
			}
		}
	}

	@Override
	public void findAndDisplay(Finder finder) {
		for (MenuDTO menuDTO : menus) {
			if (finder.test(menuDTO)) {
				System.out.println(menuDTO);
			}
		}
	}
}
