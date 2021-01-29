package com.xworkz.cosmetics.services;

import com.xworkz.cosmetics.constants.CosmeticShades;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public class CosmeticServiceImpl implements CosmeticService {
	
	private CosmeticDAO cosmeticDAO;

	public CosmeticServiceImpl(CosmeticDAO cosmeticDAO) {
		System.out.println("created CosmeticServiceImpl ");
		this.cosmeticDAO=cosmeticDAO;
	}

	@Override
	public boolean validateAndSave(CosmeticDTO cosmeticDTO) {
		boolean validData = false;
		if (cosmeticDTO != null) {
			System.out.println("dto is not null,its valid");
			String brand = cosmeticDTO.getBrand();

			if (brand != null && brand.length() >= 3 && !brand.isEmpty()) {
				System.out.println("brand is valid");
				validData = true;
			} else {
				System.out.println("brand is not valid");
				validData = false;
			}
		}
		if(validData) {
			CosmeticType type=cosmeticDTO.getType();
			if(type!=null) {
				System.out.println("type is valid");
				validData=true;
			}else {
				System.out.println("type is invalid");
				validData=false;
			}
		}
		
		
		if(validData) {
			CosmeticShades shades=cosmeticDTO.getShade();
			if(shades!=null) {
				System.out.println("shade is valid");
				validData=true;
			}else {
				System.out.println("shade is not valid");
				validData=false;
			}
		}
		if(validData) {
			double price=cosmeticDTO.getPrice();
			if(price>0) {
				System.out.println("price is valid");
				validData=true;
			}else {
				System.out.println("price is invalid");
				validData=false;
			}
		}
		if(validData) {
		int quantity=cosmeticDTO.getQuantity();
		if(quantity>0 && quantity<=100) {
			System.out.println("quantity is valid");
			validData=true;
		}else {
			System.out.println("quantity is invalid");
			validData=false;
		}
		}
		if(validData) {
			System.out.println("data is valid,can invoke dao");
			//CosmeticDAO cosmeticDAO=new CosmeticDAOImpl();
		   cosmeticDAO.save(cosmeticDTO);
		}else {
			System.out.println("invalid data,cannot invoke");
		}
		return false;
	}

	@Override
	public void deleteByBrand(String brand) {
		System.out.println("invoked deleteByBrand ");
		if(brand!=null && !brand.isEmpty() && !brand.contains(" ") && brand.length()>=3) {
			System.out.println("brand is valid,can delete."+brand);
			this.cosmeticDAO.deleteByBrand(brand);
		}
		
	}

	@Override
	public int cosmeticSize() {
		return this.cosmeticDAO.totalSize();
	}

}
