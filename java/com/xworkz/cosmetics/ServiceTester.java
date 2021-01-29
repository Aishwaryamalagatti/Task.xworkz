package com.xworkz.cosmetics;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticShades;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dto.CosmeticDTO;
import com.xworkz.cosmetics.impl.CosmeticDAOImpl;
import com.xworkz.cosmetics.services.CosmeticService;
import com.xworkz.cosmetics.services.CosmeticServiceImpl;

public class ServiceTester {

	public static void main(String[] args) {
		CosmeticDTO cosmeticDTO = new CosmeticDTO();
		cosmeticDTO.setBrand("MAC");
		cosmeticDTO.setPrice(1000);
		cosmeticDTO.setQuantity(10);
		cosmeticDTO.setShade(CosmeticShades.BLACK);
		cosmeticDTO.setType(CosmeticType.EYELINER);

		List<CosmeticDTO> list = new LinkedList<CosmeticDTO>();
		CosmeticDAO dao = new CosmeticDAOImpl(list);

		CosmeticService service = new CosmeticServiceImpl(dao);
		service.validateAndSave(cosmeticDTO);

		CosmeticDTO dto2 = new CosmeticDTO();
		dto2.setBrand("sugar");
		dto2.setPrice(1000);
		dto2.setShade(CosmeticShades.GREY);
		dto2.setType(CosmeticType.MASCARA);
		dto2.setQuantity(3);
		service.validateAndSave(dto2);

		System.out.println(service.cosmeticSize());
		service.deleteByBrand("sugar");
		System.out.println(service.cosmeticSize());
	}

}
