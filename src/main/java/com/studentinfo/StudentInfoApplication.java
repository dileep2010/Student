package com.studentinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.studentinfo.controller","com.studentinfo.delegate"})
public class StudentInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentInfoApplication.class, args);
	}
}
