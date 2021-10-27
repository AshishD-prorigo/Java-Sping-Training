package com.security.springbootstartersecurity.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.security.springbootstartersecurity.model.User;

@Service
public class UserService {
	
	List<User> list=new ArrayList<>();
	
	public UserService() {
		
		list.add(new User("Ashish","1234","adamahe@gmail.com"));
		list.add(new User("abc", "abc","abc@gmail.com"));
		list.add(new User("ajay","ajay123","ajay@gmail.com"));
	}
	
	//get all user
	public List<User> getAllUser(){
		return this.list;
	}
	
	//get Single User
	public User getUser(String username) {
		
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
	}
	
	
	//add one user
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
	
	
	
}
