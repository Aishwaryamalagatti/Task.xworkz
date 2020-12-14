package com.xworkz.transfer;
import com.xworkz.transfer.dto.*;
public class ICU {
	private boolean ventilatorAvailable;
	private double costPerDay;
	private boolean tvAvailable;
	 ICUAdmissionDetails admissionDTO;
	
	public ICU() {
		System.out.println("default constructor");
	}
	
	public ICU(boolean ventilatorAvailable,double costPerDay, boolean tvAvailable) {
		this.ventilatorAvailable=ventilatorAvailable;
		this.costPerDay=costPerDay;
		this.tvAvailable=tvAvailable;
	}
	
	public void admissionDetails(String patientName,String severity, String doctorAssigned, String nurseAssigned) {
		this.admissionDTO=new ICUAdmissionDetails(patientName,severity,doctorAssigned,nurseAssigned);
	}
	public void updateDoctorName(String newDoctorName) {
	this.admissionDTO.setDoctorAssigned(newDoctorName);
	}
	public void updateNurseName(String newNurseName) {
		this.admissionDTO.setNurseAssigned(newNurseName);
	}
	
	public ICUAdmissionDetails getAdmissionDTO() {
	return admissionDTO;
	}
	

}
