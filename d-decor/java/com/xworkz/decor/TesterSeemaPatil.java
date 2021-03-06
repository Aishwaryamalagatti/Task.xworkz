package com.xworkz.decor;

import com.xworkz.decor.constants.AppConstant;
import com.xworkz.decor.dao.DecorInteriorDAOImpl;
import com.xworkz.interior.dao.InteriorDAO;
import com.xworkz.interior.dto.InteriorDTO;

public class TesterSeemaPatil {

	public static void main(String[] args) {

		InteriorDTO interiorDTO=new InteriorDTO();
		interiorDTO.setHid(1);
		interiorDTO.setMestriName("Ram");
		interiorDTO.setForWhat(AppConstant.HOME_INTERIOR);
		interiorDTO.setBudget(400000);
		interiorDTO.setBudget(1000);
		
		InteriorDAO dao=new DecorInteriorDAOImpl();
		dao.create(interiorDTO);
		
		
	}

}
