package com.xworkz.bags.services;

import com.xworkz.bags.dto.BagDTO;

public interface BagService {
	
	void validateAndSave(BagDTO bdto);
	
	public boolean fetchingDetailsByColor(String color);

}
