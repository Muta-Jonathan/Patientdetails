package org.openmrs.module.patientdetails.dao;

import java.util.List;

import org.openmrs.module.patientdetails.Patientdetails;

public interface PatientdetailsDao {
	
	List<Patientdetails> getAllPatientdetails();
	
	Patientdetails getPatientdetailsById(int patientId);
	
	Patientdetails savePatientdetails(Patientdetails details);
	
	void purgePatientdetails(Patientdetails details);
	
}
