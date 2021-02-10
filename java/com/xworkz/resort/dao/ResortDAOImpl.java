package com.xworkz.resort.dao;

import java.util.Iterator;
import java.util.List;
import com.xworkz.resort.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO {

	private List<ResortDTO> resortList;

	public ResortDAOImpl(List<ResortDTO> list) {
		System.out.println("created ResortDAOImpl");
		this.resortList = list;
	}

	public ResortDAOImpl() {
	}

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("invoked save in dao");
		boolean added = false;
		boolean contains = this.resortList.contains(dto);
		if (!contains) {
			added = this.resortList.add(dto);
		}
		if (added)
			System.out.println("resort is added:" + dto);
		else
			System.out.println("resort is not added");
		return added;
	}

	@Override
	public boolean UpdateLocationByName(String location, String name) {
		System.out.println("invoked UpdateLocationByName");
		for (ResortDTO resortDTO : this.resortList) {
			String names = resortDTO.getName();
			if (names.equals(name)) {
				System.out.println("updated location");
				resortDTO.setName(name);
				System.out.println("updated the resort:" + resortDTO);
				return true;
			} else {
				System.out.println("not updated");
			}
		}
		return false;
	}

	@Override
	public boolean updateLocationByNameAndRating(String location, String name, float rating) {
		System.out.println("invoked updateLocationByNameAndRating ");
		for (ResortDTO resortDTO : this.resortList) {
			
			String getName = resortDTO.getName();
			float resortRating=resortDTO.getRating();
			if (getName.equals(name) && resortRating==(rating)) {
				resortDTO.setLocation(location);
				System.out.println("update the location:" + resortDTO);
				return true;
			} else {
				System.out.println("name and rating not matching,hecne not updated");
			}
		}
		return false;
	}

	@Override
	public boolean deleteByNameAndLocation(String location, String name) {
		System.out.println("invoked deleteByNameAndLocation");
		Iterator<ResortDTO> iterator = this.resortList.iterator();
		while (iterator.hasNext()) {
			ResortDTO dto = iterator.next();
			if (dto.getName().equals(name) && dto.getLocation().equals(location)) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addMultipleResorts(List<ResortDTO> dtos) {
		System.out.println("invoked addMultipleResorts");
		
		return false;
	}

	@Override
	public int totalRsortSize() {
		System.out.println("invoked totalRsortSize");
		int size = resortList.size();
		System.out.println("size is:" + size);
		return this.resortList.size();
	}

	@Override
	public List<ResortDTO> gettAll() {
		System.out.println("invoked getAll");
		return this.resortList;
	}

}
