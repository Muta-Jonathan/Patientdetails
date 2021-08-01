/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.patientdetails.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.patientdetails.Patientdetails;
import org.openmrs.module.patientdetails.PatientdetailsService;
import org.openmrs.module.patientdetails.dao.PatientdetailsDao;
import org.springframework.beans.factory.annotation.Autowired;

public class PatientdetailsServiceImpl extends BaseOpenmrsService implements PatientdetailsService {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	PatientdetailsDao dao;
	
	@Override
	public void onShutdown() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onStartup() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Patientdetails> getAllPatientdetails() {
		
		return dao.getAllPatientdetails();
	}
	
	@Override
	public Patientdetails getPatientdetailsById(int patientId) {
		
		return dao.getPatientdetailsById(patientId);
	}
	
	@Override
	public Patientdetails savePatientdetails(Patientdetails details) {
		
		return dao.savePatientdetails(details);
	}
	
	@Override
	public void purgePatientdetails(Patientdetails details) {
		dao.purgePatientdetails(details);
		
	}
	
}
