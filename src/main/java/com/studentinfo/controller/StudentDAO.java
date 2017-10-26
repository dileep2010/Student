package com.studentinfo.controller;

import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<StudentDMO, Long>{
	
	StudentDMO findByFirstName(String firstName);

}
