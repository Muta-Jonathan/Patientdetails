/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.patientdetails.web.controller;

import org.openmrs.module.patientdetails.Patientdetails;
import org.openmrs.module.patientdetails.service.PatientdetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This class configured as controller using annotation and mapped with the URL of
 * 'module/patientdetails/patientdetailsLink.form'.
 */
@Controller
@RequestMapping(value = "module/patientdetails")
public class PatientdetailsController {
	
	@Autowired
	PatientdetailsService service;
	
	@RequestMapping("/addPatientDetails.form")
	public void addPatientDetails() {
		
	}
	
	public String Onsubmit(@ModelAttribute("details") Patientdetails details) {
		service.savePatientdetails(details);
		return "module/patientdetails/addPatientDetails.form";
	}
	
	@RequestMapping("/returnPatientDetails.form")
	public void addedPatientDetails() {
		
	}
	
}
