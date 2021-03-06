package com.xworkz.decor.dao;

import com.xworkz.interior.dao.InteriorDAO;
import com.xworkz.interior.dto.InteriorDTO;

public class DecorInteriorDAOImpl implements InteriorDAO {
	
	public DecorInteriorDAOImpl() {
		System.out.println("created DecorInteriorDAOImpl");
	}

	@Override
	public void create(InteriorDTO dto) {
		System.out.println("invoked create from DecorInteriorDAOImpl");
		System.out.println("arg:"+dto);
	}

	@Override
	public void deleteById(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public InteriorDTO fetchByMestriName(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public InteriorDTO updateByMestriNameById(String arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
