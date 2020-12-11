package com.xworkz.data.dto;

public class CountryDTO {
	private String name;
	private String continent;
	private String[] states;
	private long population;
	private String primeMinister;
	private String president;
	private String[] languages;

	public CountryDTO() {
		System.out.println("default constructor");
	}

	public CountryDTO(String name, String continent) {
		System.out.println("2 parameters");
		this.name = name;
		this.continent = continent;
	}

	public CountryDTO(long population, String primeMinister, String president) {
		System.out.println("3 parameters");
		this.population = population;
		this.primeMinister = primeMinister;
		this.president = president;
	}

	public CountryDTO(String[] languages,String[] states)  {
		System.out.println("4th constructor");
		this.languages=languages;
		this.states=states;
	}

	public CountryDTO(String name,String continent,long population,
			String primeMinister,String president) {
		System.out.println("5 parameters");
		this.name = name;
		this.continent = continent;
		this.population = population;
		this.primeMinister = primeMinister;
		this.president = president;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String[] getStates() {
		return states;
	}

	public void setStates(String[] states) {
		this.states = states;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getPrimeMinister() {
		return primeMinister;
	}

	public void setPrimeMinister(String primeMinister) {
		this.primeMinister = primeMinister;
	}

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String languages[]) {
		this.languages = languages;
	}
}


