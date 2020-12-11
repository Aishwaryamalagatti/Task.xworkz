package com.xworkz.data;

import com.xworkz.data.dto.*;

public class CompanyTester {
	public static void main(String[] args) {
		CompanyDTO dto = new CompanyDTO();
		System.out.println(dto.getCompanyName());

		CompanyDTO dto2 = new CompanyDTO("Microsoft", 163000);
		System.out.println(dto2.getCompanyName());
		System.out.println(dto2.getEmployees());

		CompanyDTO dto3 = new CompanyDTO("United States", "outlook.com", "www.microsoft.com",
				"Bill Gates and Paul Allen");
		System.out.println(dto3.getLocation());
		System.out.println(dto3.getEmail());
		System.out.println(dto3.getWebsite());
		System.out.println(dto3.getFounder());

	}
}