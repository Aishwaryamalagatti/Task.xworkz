package com.xworkz.resort;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;

public class ResortTester {

	public static void main(String[] args) {
		
		List<ResortDTO> list=new LinkedList<ResortDTO>();
		

		ResortDTO resortDTO=new ResortDTO();
		resortDTO.setLocation("bangalore");
		resortDTO.setName("shilandra");
		resortDTO.setNoOfRooms(20);
		resortDTO.setNoOfEmployees(15);
		resortDTO.setPhoneNo(8766980542l);
		resortDTO.setOffers(true);
		resortDTO.setPoolExist(true);
		resortDTO.setPricePerHead(1000);
		resortDTO.setRating(4);
		
		ResortDAO dao=new ResortDAOImpl(list);
		dao.save(resortDTO);
		
		ResortDTO dto1=new ResortDTO("lakeview","dharwad", "ramesh", 15);
		dto1.setRating(3);
		dao.save(dto1);
		
		ResortDTO dto2=new ResortDTO("ocean pearl", "hubli", "raj", 20);
		dto2.setRating(4);
		dao.save(dto2);
		
		boolean update=dao.UpdateLocationByName("Dandeli", "lakeview");
		System.out.println("update:"+update);
		
		boolean update1=dao.updateLocationByNameAndRating("bangalore", "ocean pearl", 4);
		System.out.println("updated:"+update1);
		
		dao.totalRsortSize();
		System.out.println(dao.gettAll());

		dao.deleteByNameAndLocation("dharwad", "lakeview");
		dao.totalRsortSize();

		System.out.println(dao.gettAll());
	}
	

}
