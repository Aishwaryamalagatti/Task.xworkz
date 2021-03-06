package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.solution.dto.ShoppingCartDTO;

public class CartTester {

	public static void main(String[] args) {

		ShoppingCartDTO dto1=new ShoppingCartDTO();
		dto1.setItemName("Salwar");
		dto1.setPrice(1500);
		dto1.setQuantity(1);
		
		ShoppingCartDTO dto2=new ShoppingCartDTO();
		dto2.setItemName("Tops");
		dto2.setQuantity(2);
		dto2.setPrice(600);
		
		Collection<ShoppingCartDTO> shop=new ArrayList();
		shop.add(dto1);
		shop.add(dto2);
		System.out.println(shop);
		
		int cart=shop.size();
		System.out.println("size is:"+cart);

		ShoppingCartDTO dto3=new ShoppingCartDTO();
		dto3.setItemName("shoe");
		dto3.setPrice(900);
		dto3.setQuantity(1);
		
		
		boolean contain=shop.contains(dto3);
		System.out.println("contains:"+contain);
		
		if(contain) {
			System.out.println("shoe is in cart");
		}else {
			System.out.println("adding shoe to cart");
			shop.add(dto3);
		}
		System.out.println("after adding shoe:"+shop.size());
		System.out.println(shop);
		
		
		
	}
}
