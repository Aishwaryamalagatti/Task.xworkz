package com.xworkz.transfer;
import com.xworkz.transfer.tester.*;

public class Hospital {
	
	private String name;
	private String location;
	private int appointmentSlots=5;
	private AppointmentDTO appointmentDTO;
	
	public Hospital(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void appointment(String name,long mobileNumber,int age,String reason,String doctorName) {
	this.appointmentDTO=new AppointmentDTO(name,mobileNumber,age,reason,doctorName);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAppointmentSlots() {
		return appointmentSlots;
	}

	public void setAppointmentSlots(int appointmentSlots) {
		this.appointmentSlots = appointmentSlots;
	}

	public AppointmentDTO getAppointmentDTO() {
		return appointmentDTO;
	}

	public void setAppointmentDTO(AppointmentDTO appointmentDTO) {
		this.appointmentDTO = appointmentDTO;
	}
	

}
