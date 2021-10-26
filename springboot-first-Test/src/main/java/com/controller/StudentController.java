package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Test.springbootfirstTest.Student;
import com.Test.springbootfirstTest.Student_Service;

@RestController
public class StudentController {
	@Autowired
	private Student_Service service;
	
	@GetMapping("/home")
	public String get() {
		return "Welcome to home";
	}
	
	
	@PostMapping("/add")
	public Student add_st(@RequestBody Student student) {
		return service.add_Student(student);
	}
	

}
