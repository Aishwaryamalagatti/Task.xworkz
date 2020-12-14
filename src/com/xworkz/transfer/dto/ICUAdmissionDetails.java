package com.xworkz.transfer.dto;

public class ICUAdmissionDetails {

	private String patientName;
	private String severity;
	private String doctorAssigned;
	private String nurseAssigned;
	
	public ICUAdmissionDetails() {
		System.out.println("created ICUAdmissionDetails");
	}

	public ICUAdmissionDetails(String patientName, String severity, String doctorAssigned, String nurseAssigned) {
		this.patientName = patientName;
		this.severity = severity;
		this.doctorAssigned = doctorAssigned;
		this.nurseAssigned = nurseAssigned;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getDoctorAssigned() {
		return doctorAssigned;
	}

	public void setDoctorAssigned(String doctorAssigned) {
		this.doctorAssigned = doctorAssigned;
	}

	public String getNurseAssigned() {
		return nurseAssigned;
	}

	public void setNurseAssigned(String nurseAssigned) {
		this.nurseAssigned = nurseAssigned;
	}

}
