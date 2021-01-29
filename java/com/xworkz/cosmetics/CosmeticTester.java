package com.xworkz.cosmetics;

import com.xworkz.cosmetics.constants.*;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.impl.CosmeticDAOImpl;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {
		
		//data is represented in the form of dto
		CosmeticDTO dto=new CosmeticDTO();
		dto.setBrand("maybelline");
		dto.setType(CosmeticType.TONER);
		dto.setPrice(200);
		dto.setQuantity(50);
		dto.setShade(CosmeticShades.PINK);

		CosmeticDAO dao=new CosmeticDAOImpl();
		dao.save(dto);
		
		CosmeticDTO dto1=new CosmeticDTO("lakme", 300, 9, CosmeticType.FOUNDATION,
		  CosmeticShades.NUDE); 
		  dao.save(dto1);
		 
		  CosmeticDTO dto2=new CosmeticDTO("lakme", 300, 7, CosmeticType.FOUNDATION,
		  CosmeticShades.NUDE); 
		  dao.save(dto2);
		  
		  CosmeticDTO dto3=new CosmeticDTO("nykaa", 500, 10, CosmeticType.LIPSTICK,
		  CosmeticShades.PINK);
		  dao.save(dto3);
		 
		
		boolean update=dao.updatePriceAndQuantityByBrand(400, 5, "nykaa") ;
		System.out.println("updated:"+update);
		
		boolean updatePrice=dao.updatePriceByBrandAndType(600, "nykaa", CosmeticType.LIPSTICK);
		System.out.println("updatePrice:"+updatePrice);	
		
		boolean updateTypeByBrand=dao.updateTypeByBrand("maybelline", CosmeticType.PRIMER);
		System.out.println("updated type  is:"+updateTypeByBrand);
		
		dao.totalSize();
		dao.deleteAll();
		dao.totalSize();

		//dao.getAll();
	}
	

}
