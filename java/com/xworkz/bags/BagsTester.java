package com.xworkz.bags;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.bags.constants.Brand;
import com.xworkz.bags.dao.BagDAO;
import com.xworkz.bags.dao.BagDAOImpl;
import com.xworkz.bags.dto.BagDTO;
import com.xworkz.bags.services.BagService;
import com.xworkz.bags.services.BagServiceImpl;

public class BagsTester {

	public static void main(String[] args) {
		
	List<BagDTO> list=new LinkedList<BagDTO>();
	
	BagDTO bagDTO=new BagDTO();
	bagDTO.setBrand(Brand.PUMA);
	bagDTO.setColor("brown");
	bagDTO.setHoldLaptop(true);
	bagDTO.setPrice(1500d);
	
	BagDAO dao = new BagDAOImpl(list);
	dao.save(bagDTO);
		
		BagDTO dto1 = new BagDTO(Brand.AMERICAN_TOURISTER, "blue", 1000d, false);
		dao.save(dto1);

		BagDTO dto2 = new BagDTO(Brand.SKYBAGS, "black", 1800d, true);
		dao.save(dto2);

		BagDTO dto3 = new BagDTO(Brand.FILA, "red", 2000d, true);
		dao.save(dto3);

		BagDTO dto4 = new BagDTO(Brand.NIKE, "orange", 900d, false);
		dao.save(dto4);
		
		
		boolean update=dao.updatePriceByBrand(1700d, Brand.FILA);
		System.out.println("updated::"+update);
		
		System.out.println("total size is:"+dao.totalSize());
		
		boolean delete=dao.deleteByColor("brown");
		System.out.println(delete);
		
		System.out.println("total size is:"+dao.totalSize());
		
		BagService service=new BagServiceImpl();
		service.validateAndSave(bagDTO);
	}
}
