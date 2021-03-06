package com.xworkz.interior.dao;

import com.xworkz.interior.dto.InteriorDTO;

public interface InteriorDAO {

	public void create(InteriorDTO dto);

	public void deleteById(int id);

	public InteriorDTO fetchByMestriName(String name);

	public int total();

	public InteriorDTO updateByMestriNameById(String newName, int id);

}
