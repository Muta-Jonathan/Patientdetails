package org.openmrs.module.patientdetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "patientdetails.Page")
@Table(name = "Patient_details_page")
public class Patientdetails {
	
	@Id
	@GeneratedValue
	@Column(name = "Patient_Id")
	private int patientId;
	
	@Column(name = "First_name")
	private String firstname;
	
	@Column(name = "Last_name")
	private String lastname;
	
	@Column(name = "Patient_Issue")
	private String patientissue;
	
	@Column(name = "Age")
	private int age;
	
	public int getPatientId() {
		return patientId;
	}
	
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getPatientissue() {
		return patientissue;
	}
	
	public void setPatientissue(String patientissue) {
		this.patientissue = patientissue;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
