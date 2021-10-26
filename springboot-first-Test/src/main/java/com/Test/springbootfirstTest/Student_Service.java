package com.Test.springbootfirstTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class Student_Service {
	@Autowired
	private StudentRepository st;
	
	public Student add_Student( Student student) {
		return st.save(student);
	}
	

}
