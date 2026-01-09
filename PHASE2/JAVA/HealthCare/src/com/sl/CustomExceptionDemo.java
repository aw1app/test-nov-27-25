package com.sl;

import com.sl.customers.Patient;
import com.sl.staff.Doctor;
import com.sl.utils.AppointmentScheduler;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		// Create two doctor instances

		Doctor doctor1 = new Doctor();
		doctor1.name = "Dr. Sudhakar";
	
		doctor1.qualification = "MBBS (London)";

		Patient patient2 = new Patient("Manohar", 24, "High Fever");
		
		AppointmentScheduler scheduler = new AppointmentScheduler();
		try {
			scheduler.scheduleAppointment(doctor1, patient2);
		} catch (DoctorNotFoundException e) {
			System.out.println("Docter exception happened");
		}

	}

}
