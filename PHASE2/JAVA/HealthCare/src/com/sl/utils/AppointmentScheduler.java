package com.sl.utils;

import com.sl.DoctorNotFoundException;
import com.sl.customers.Patient;
import com.sl.staff.Doctor;

public class AppointmentScheduler {
	
	public boolean scheduleAppointment(Doctor doc, Patient patient) throws DoctorNotFoundException{
		if(doc.isAvailable()==false)
			throw new DoctorNotFoundException("doctor is not available!");
		else {
			System.out.println("appointment is scheduled b/w " + doc.name + " and " + patient.name);
			return true;
		}
	};

}
