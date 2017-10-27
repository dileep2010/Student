package com.studentinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/api")
public class StudentController {
	
	
	@Autowired
	private StudentDelegate delegate;
	
	@RequestMapping("/hello")
	public  @ResponseBody String getAllStudent(@RequestParam String firstName, @RequestParam String lastName){
		return delegate.getAllStudentsInfo(firstName, lastName);
	
	
	@RequestMapping("getByFirstName")
	public @ResponseBody StudentDMO getByFirstName(@RequestParam String fname){
		
		return delegate.getByFirstName(fname);
	}
	
	@RequestMapping("getAllStudents")
	public @ResponseBody Iterable<StudentDMO> getAllStudents(){
		return delegate.getAlStudents();
	}

}
