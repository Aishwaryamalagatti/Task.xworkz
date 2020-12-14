package com.xworkz.transfer.tester;

import com.xworkz.transfer.ICU;
import com.xworkz.transfer.dto.ICUAdmissionDetails;

public class ICUTester2 {

	public static void main(String[] args) {
		ICU icu=new ICU(true,2000,true);
		icu.admissionDetails("sita", "High sugar", "Dr.Hegde", "sapna");
		ICUAdmissionDetails admissionDTO=icu.getAdmissionDTO();
		System.out.println(admissionDTO.getPatientName());
		System.out.println(admissionDTO.getSeverity());
		System.out.println(admissionDTO.getDoctorAssigned());
		System.out.println(admissionDTO.getNurseAssigned());
	}

}
