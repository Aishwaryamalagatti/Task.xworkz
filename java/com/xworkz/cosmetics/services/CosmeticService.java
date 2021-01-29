package com.xworkz.cosmetics.services;

import com.xworkz.cosmetics.dto.CosmeticDTO;

public interface CosmeticService {
	
	public boolean validateAndSave(CosmeticDTO cosmeticDTO);
	
	void deleteByBrand(String brand);
	
	int cosmeticSize();
	

}
