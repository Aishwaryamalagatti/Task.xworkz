package com.xworkz.transfer.tester;
import com.xworkz.transfer.*;

public class HospitalTester {

	public static void main(String[] args) {
		Hospital hospital=new Hospital("VICTORIA","City Market");

		hospital.appointment("Lily",987645267,22,"high fever","Dr.Patil");
		AppointmentDTO appointment=hospital.getAppointmentDTO();
		System.out.println("patient name:" +appointment.getPatientName());
		System.out.println("mobile number:"+appointment.getMobileNumber());
		System.out.println("age:" +appointment.getAge());
		System.out.println("reason:" +appointment.getReason());
		System.out.println("doctor name:" +appointment.getDoctorName());

	}

}
