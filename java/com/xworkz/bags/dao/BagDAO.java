package com.xworkz.bags.dao;

import java.util.List;

import com.xworkz.bags.constants.Brand;
import com.xworkz.bags.dto.BagDTO;

public interface BagDAO {

	public boolean save(BagDTO dto);
	
	public boolean updatePriceByBrand(double price,Brand brand);
	
	public boolean deleteByColor( String color);
	
	public int totalSize();
	
	List<BagDTO> getAll();
	
}
