package com.studentinfo.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Student")
public class StudentDMO {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	@Column(name="FirstName")
	String firstName;
	
	@Column(name="LastName")
	String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
