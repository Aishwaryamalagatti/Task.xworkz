package com.xworkz.transfer.tester;
import com.xworkz.transfer.*;
import com.xworkz.transfer.dto.*;

public class ICUTester 
{
	public static void main(String[] args)
	{
	 ICU icu;
	 icu=new ICU(true,1000,false);
	 
	 icu.admissionDetails("geeta","Accident","Dr.Batra","aarti");
	 ICUAdmissionDetails dto=icu.getAdmissionDTO();
	 System.out.println(dto.getPatientName());
	 System.out.println(dto.getSeverity());
	 System.out.println(dto.getDoctorAssigned());
	 System.out.println(dto.getNurseAssigned());

	 
	 icu.updateDoctorName("Dr.Shah");
	 System.out.println(dto.getDoctorAssigned());
	 icu.updateNurseName("preeti");
	 System.out.println(dto.getNurseAssigned());
	}
}

