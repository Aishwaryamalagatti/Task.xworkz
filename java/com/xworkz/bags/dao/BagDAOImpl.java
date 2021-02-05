package com.xworkz.bags.dao;

import java.util.Iterator;
import java.util.List;

import com.xworkz.bags.constants.Brand;
import com.xworkz.bags.dto.BagDTO;

public class BagDAOImpl implements BagDAO {

	private List<BagDTO> bagList;

	public BagDAOImpl() {
	}

	public BagDAOImpl(List<BagDTO> list) {
		System.out.println("created BagDAOImpl");
		this.bagList = list;
	}

	@Override
	public boolean save(BagDTO dto) {
		System.out.println("invoke save method from dao");
		boolean added = false;

		boolean contains = this.bagList.contains(dto);
		if (!contains) {
			added = this.bagList.add(dto);
		}
		if (added)
			System.out.println("bag is added:" + dto);
		else
			System.out.println("bag is not added");
		return added;
	}

	@Override
	public boolean updatePriceByBrand(double price, Brand brand) {
		System.out.println("invoked updatePriceByBrand");
		for (BagDTO bagdto : this.bagList) {
			Brand brands = bagdto.getBrand();
			if (brands.equals(brand)) {
				System.out.println("updated price");
				//bagdto.getBrand();
				System.out.println("updated brand:" + brands);
				return true;
			} else {
				System.out.println("not updated");
			}
		}
		return false;
	}

	@Override
	public boolean deleteByColor( String color) {
		System.out.println("invoked deleteByColor");
		Iterator<BagDTO> iterator=this.bagList.iterator();
		while(iterator.hasNext()) {
			BagDTO dtos=iterator.next();
			if(dtos.getColor().equals(color)) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}

	@Override
	public int totalSize() {
		return this.bagList.size();
	}

	@Override
	public List<BagDTO> getAll() {
		System.out.println("over riding getAll method");
		return this.bagList;
	}
		
	}

