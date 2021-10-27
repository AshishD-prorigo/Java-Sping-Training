package com.security.springbootstartersecurity.homeControl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.springbootstartersecurity.controller.UserController;

@RestController
@RequestMapping("public")
public class HomeControl {
	
	@Autowired
	private UserController userController;
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	@GetMapping("login")
	public String login() {
		return "this is Login Page";
	}

}
