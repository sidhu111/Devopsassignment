package com.htc.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.userservice.entity.User;
import com.htc.userservice.service.UserserviceInterface;



@RestController
@RequestMapping("/api")
public class Userservicecontroller {
	
	
	@Autowired
	private UserserviceInterface userserviceinterface;
	
	
	@PostMapping("/adduser") 
	public User createUserdetail(@RequestBody User user) {
		   
		 return userserviceinterface.save(user);
	}
	
	
	
	
	@GetMapping("/user/{id}") 
	public User getUserByid(@PathVariable String id) {
		User user =null;
	
		user=userserviceinterface.findById(id).get();
		return user;
	}
	

}
