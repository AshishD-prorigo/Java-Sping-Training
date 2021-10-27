package com.security.springbootstartersecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.springbootstartersecurity.Services.UserService;
import com.security.springbootstartersecurity.model.User;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	private UserService service;
	// all user
	@GetMapping("/")
	public List<User> getAllUser(){
		return this.service.getAllUser();
	}
	
	//return single user
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable String username) {
		return this.service.getUser(username);
	}
	
	@PostMapping("/add")
	public User add(@RequestBody User user) {
		return this.service.addUser(user);
	}
	
	
}
