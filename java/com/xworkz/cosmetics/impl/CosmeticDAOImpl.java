package com.xworkz.cosmetics.impl;

import java.util.Iterator;
import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO {

	// cosmetics is the collection for CosmeticDAOImpl
	private List<CosmeticDTO> cosmetics;

	// using set method
	public CosmeticDAOImpl(List<CosmeticDTO> list) {
		this.cosmetics =list;// creating implementation for the interface(cosmetics)
		System.out.println("created CosmeticDAOImpl");
	}
	public CosmeticDAOImpl() {
	}

	@Override
	public boolean save(CosmeticDTO dto) {
		boolean added = false;
		boolean contains = this.cosmetics.contains(dto);
		if (!contains) {
			added = this.cosmetics.add(dto);
		}
		if (added)
			System.out.println("cosmetic is added:" + dto);
		else
			System.out.println("cosmetic is not added");
		return added;
	}
	// return false;

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		System.out.println("invoked updatePriceAndQuantityByBrand");
		for (CosmeticDTO cosmeticdto : this.cosmetics) {
			String brandFromDto = cosmeticdto.getBrand();
			if (brandFromDto.equals(brand)) {
				System.out.println("can update,brand is available");
				cosmeticdto.setPrice(price);
				cosmeticdto.setQuantity(quantity);
				System.out.println("updated price and quantity is:" + cosmeticdto);
				return true;
			} else {
				System.out.println("brand not found.cannot update");
			}
		}
		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type) {
		System.out.println("invoked updatePriceByBrandAndType");

		for (CosmeticDTO cosmetic : this.cosmetics) {
			String updateBrand = cosmetic.getBrand();
			CosmeticType costype=cosmetic.getType();
			if (updateBrand.equals(brand) && costype.equals(type)) {
				cosmetic.setPrice(price);
				System.out.println("updated the price:" + cosmetic);
				return true;
			} else {
				System.out.println("brand and type not found,hence not updated");
			}
		}
		return false;
	}

	@Override
	public boolean updateTypeByBrand(String brand, CosmeticType type) {
		System.out.println("invoked updateTypeByBrand");
		for(CosmeticDTO cosdto:this.cosmetics) {
			String types=cosdto.getBrand();
			if(types.equals(brand)) {
				System.out.println("update type ");
				cosdto.setType(type);
				System.out.println("updates the type:"+cosdto);
				return true;
			}else {
				System.out.println("not updates");
			}
		}
		return false;
	}

	@Override
	public void deleteAll() {
		Iterator<CosmeticDTO> iterator=cosmetics.iterator();
		while(iterator.hasNext()) {
			CosmeticDTO next=iterator.next();
			iterator.remove();
		}
	}
	@Override
	public int totalSize() {
		System.out.println("invoked total size");
		int size=cosmetics.size();
		System.out.println("size is:"+size);
		return this.cosmetics.size();
	}

	@Override
	public List<CosmeticDTO> getAll() {
		System.out.println("get all ");
		return this.cosmetics;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		Iterator<CosmeticDTO> iterator=this.cosmetics.iterator();
		while(iterator.hasNext())
		{
			CosmeticDTO dto=iterator.next();
			if(dto.getBrand().equals(brand))
			{
				iterator.remove();
				return true;
			}
	}
		return false;
}
}
