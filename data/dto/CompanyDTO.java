package com.xworkz.data.dto;

public class CompanyDTO {
	private String companyName;
	private int employees;
	private String location;
	private String email;
	private String website;
	private String founder;

	public CompanyDTO() {
		System.out.println("default constructor");
	}

	public CompanyDTO(String companyName, int employees) {
		System.out.println("2 parameters*************");
		this.companyName = companyName;
		this.employees = employees;
	}

	public CompanyDTO(String location, String email, String website, String founder) {
		System.out.println("4 parameters*************");
		this.location = location;
		this.email = email;
		this.website = website;
		this.founder = founder;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}
}
