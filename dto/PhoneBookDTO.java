package com.xworkz.phoneBook.dto;

public class PhoneBookDTO implements Cloneable{

	private String name;
	private String pincode;
	private long phoneNo;

	public PhoneBookDTO() {
		System.out.println("created PhoneBookDTO constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		System.out.println("over riding toString method");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("over riding hashCode method");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("over riding equals method");
		if(obj!=null) {
			System.out.println("obj is not null");
			if(this==obj) {
			return true;
		}else {
			if(obj instanceof PhoneBookDTO) {
				PhoneBookDTO dto=(PhoneBookDTO)obj;
				if(dto.getPhoneNo()==this.phoneNo) {
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
	protected PhoneBookDTO clone() throws CloneNotSupportedException {
		System.out.println("invoked clone");
		return (PhoneBookDTO)super.clone();
	}
	
}	
