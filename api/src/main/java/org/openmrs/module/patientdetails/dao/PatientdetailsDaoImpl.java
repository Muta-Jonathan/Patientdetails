/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.patientdetails.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.db.hibernate.DbSession;
import org.openmrs.api.db.hibernate.DbSessionFactory;
import org.openmrs.module.patientdetails.Patientdetails;
import org.openmrs.module.patientdetails.dao.PatientdetailsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("patientdetails.PatientdetailsDao")
public class PatientdetailsDaoImpl implements PatientdetailsDao {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	DbSessionFactory sessionFactory;
	
	private DbSession getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public Patientdetails getPatientdetailsById(int patientId) {
		return (Patientdetails) getSession().get(Patientdetails.class, patientId);
	}
	
	@Override
	public Patientdetails savePatientdetails(Patientdetails details) {
		getSession().saveOrUpdate(details);
		return details;
		
	}
	
	@Override
	public void purgePatientdetails(Patientdetails details) {
		getSession().delete(details);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Patientdetails> getAllPatientdetails() {
		
		return getSession().createCriteria(Patientdetails.class).list();
	}
}
