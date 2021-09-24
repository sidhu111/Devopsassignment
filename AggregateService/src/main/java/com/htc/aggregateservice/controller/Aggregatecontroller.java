package com.htc.aggregateservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.htc.aggregateservice.entity.User;
import com.htc.aggregateservice.externalservices.BookingInterface;
import com.htc.aggregateservice.externalservices.RestaurantInterface;
import com.htc.aggregateservice.externalservices.UserInterface;


@RestController
public class Aggregatecontroller {
	
	@Autowired
	UserInterface userinterface;
	@Autowired
	RestaurantInterface resterantinterface;
	@Autowired
	BookingInterface bookinginterface;
	
	@GetMapping("/aggergateservice/{id}") 
	User getUserByid(@PathVariable String id) {
		User user =null;
		
		user=userinterface.getUserByid(id);
		return user;
	
	}
	

}
