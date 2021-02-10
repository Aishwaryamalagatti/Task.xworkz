package com.xworkz.resort.dao;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortDAO {
	
	boolean save(ResortDTO dto);
	
	boolean UpdateLocationByName(String location, String name);

	boolean updateLocationByNameAndRating(String location, String name, float rating);

	boolean deleteByNameAndLocation(String location, String name);

	boolean addMultipleResorts(List<ResortDTO> dtos);

	int totalRsortSize();

	List<ResortDTO> gettAll();


}
