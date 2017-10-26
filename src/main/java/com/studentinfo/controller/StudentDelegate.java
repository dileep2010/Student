package com.studentinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDelegate {
	
	@Autowired
	private StudentDAO dao;
	
	public String getAllStudentsInfo(String fname, String lname){
		StudentDMO  saveddmo = new StudentDMO();
		saveddmo.setLastName(lname);
		saveddmo.setFirstName(fname);
		
		 dao.save(saveddmo);
		
		return "success";
	}

	public StudentDMO getByFirstName(String fname) {
		
		StudentDMO dmo = dao.findByFirstName(fname);
		return dmo;
	}

	public Iterable<StudentDMO> getAlStudents() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
