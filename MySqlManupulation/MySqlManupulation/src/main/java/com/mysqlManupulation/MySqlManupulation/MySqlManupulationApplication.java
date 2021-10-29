package com.mysqlManupulation.MySqlManupulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mysqlManupulation.MySqlManupulation.userRepo.UserRepository;
@SpringBootApplication
public class MySqlManupulationApplication {

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(MySqlManupulationApplication.class, args);

		
		UserRepository userRepo=context.getBean(UserRepository.class);
		
//		User user4=new User();
//		user4.setId(50);
//		user4.setCity("Pune");
//		user4.setName("Akshay");
//		user4.setStatus("Actor");
//		User as=userRepo.save(user4);
//		
//		System.out.println(as);
//		
//		User user5=new User();
//		user5.setId(66);
//		user5.setCity("Pune");
//		user5.setName("Salman Khan");
//		user5.setCity("Actor,Singer");
//		List<User> user3=List.of(user5,user4);
//		Iterable<User> itr=userRepo.saveAll(user3);
//		
//		itr.forEach((user-> System.out.println(user3)));
//		
		//get single Object /row by id
//		Optional<User> irt=userRepo.findById(66);
//		Object tr=irt;
//		System.out.println(tr);
		
		//Find all user 
//		Iterable<User> itr=userRepo.findAll();
//		Iterator<User> ty=itr.iterator();
//		while(ty.hasNext()) {
//			User user=ty.next();
//			System.out.println(user);
//		}
		
//		Optional<User> optional=userRepo.findById(66);
//		User user=optional.get();
//		user.setCity("Mumbai");
//		user.setStatus("Actor Singer");
//		User result=userRepo.save(user);
//		System.out.println(result);
		
		
//		delete row 
//		userRepo.deleteById(12);
//		System.out.println("Deleted");
	}

}
