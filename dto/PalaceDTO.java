package com.xworkz.cockroach.dto;

public class PalaceDTO implements Cloneable{
	
	private String location;
	private String kingName;
	private String queenName;
	
	public PalaceDTO() {
		System.out.println("created PalaceDTO ");
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getKingName() {
		return kingName;
	}

	public void setKingName(String kingName) {
		this.kingName = kingName;
	}

	public String getQueenName() {
		return queenName;
	}

	public void setQueenName(String queenName) {
		this.queenName = queenName;
	}

	@Override
	public String toString() {
		System.out.println("override toString method");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("override hashCode method");
		return super.hashCode();
	}
	
	public boolean equals(Object obj) {
		System.out.println("over ride equals method");
		if(obj!=null) {
			System.out.println("object is not null");
			if(this==obj) {
				return true;
			}else {
				if(obj instanceof PalaceDTO) {
					PalaceDTO dto=(PalaceDTO)obj;
					if(dto.getKingName()==this.kingName) {
						return true;
					}
				}
				System.out.println("obj is null");
				return false;			
			}
		}
		return false;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("over riding clone method");
		return super.clone();
	}

}
