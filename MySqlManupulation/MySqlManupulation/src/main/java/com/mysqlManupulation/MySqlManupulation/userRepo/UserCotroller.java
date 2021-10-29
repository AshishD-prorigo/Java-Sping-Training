package com.mysqlManupulation.MySqlManupulation.userRepo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/data")
public class UserCotroller {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/adddata")
	public User addUser(@RequestBody User user) {
		
		userRepository.save(user);
		return  user;
	}
	
	@GetMapping("/{id}")
	public Optional<User> getUser(@PathVariable int id) {
		Optional<User> user=userRepository.findById(id);
		return  user;
	}
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
		return (List<User>)userRepository.findAll();
	}
	
	@PutMapping("/update/{id}")
	public User update(@RequestBody int id){
		Optional<User> optional=userRepository.findById(id);
		User user=optional.get();
		user.setCity("");
		user.setName("");
		user.setStatus("");
		userRepository.save(user);
		return user;
		
	}
	
	@DeleteMapping("/delete/{id}")
	public User delete(@PathVariable int id) {
		Optional<User> user=userRepository.findById(id);
		User user2=user.get();
				userRepository.deleteById(id);
		
		return user2;	
	}
	

}
