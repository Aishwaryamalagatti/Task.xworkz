package com.xworkz.cockroach.dto;

public class PlayerDTO {

	private String name;
	private int jerseyNo;
	private String sport;

	public PlayerDTO() {
		System.out.println("created PlayerDTO");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJerseyNo() {
		return jerseyNo;
	}

	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	@Override
	public String toString() {
		System.out.println("over ride toString ");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("ovr ride hashCode");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null)
			if (this == obj) {
				return true;
			} else {
				if (obj instanceof PlayerDTO) {
					PlayerDTO dto = (PlayerDTO) obj;
					if (dto.getJerseyNo() > 0 && dto.getJerseyNo() == this.jerseyNo) {
						return true;
					} else {
						return false;
					}
				}
			}
		return false;
	}
}