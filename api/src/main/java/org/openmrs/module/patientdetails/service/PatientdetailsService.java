/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.patientdetails.service;

import java.util.List;

import org.openmrs.module.patientdetails.Patientdetails;
import org.springframework.transaction.annotation.Transactional;

/**
 * The main service of this module, which is exposed for other modules. See
 * moduleApplicationContext.xml on how it is wired up.
 */
public interface PatientdetailsService {
	
	@Transactional(readOnly = true)
	List<Patientdetails> getAllPatientdetails();
	
	/**
	 * Returns Patientdetails by Patientid. It is fetched in read only transaction.
	 */
	@Transactional(readOnly = true)
	Patientdetails getPatientdetailsById(int patientId);
	
	/**
	 * Saves Patientdetails. It is executed in a transaction.
	 */
	@Transactional
	Patientdetails savePatientdetails(Patientdetails details);
	
	/**
	 * Saves Patientdetails. It is executed in a transaction.
	 */
	@Transactional
	void purgePatientdetails(Patientdetails details);
}
