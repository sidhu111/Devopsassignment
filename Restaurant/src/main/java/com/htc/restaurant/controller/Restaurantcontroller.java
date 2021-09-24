package com.htc.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.restaurant.entity.Resturant;
import com.htc.restaurant.repository.RestaurantInterface;



@RestController
@RequestMapping("/api")
public class Restaurantcontroller {
	
	
	@Autowired
	private RestaurantInterface restaurantinterface;
	
	
	
	@PostMapping("/addrestaurent") 
	public Resturant createRestaurant(@RequestBody Resturant restaurant) {
		   
		 return restaurantinterface.save(restaurant);
	}
	
	
	
	
	@GetMapping("/user/{id}") 
	public Resturant getRestaurantByid(@PathVariable String id) {
		Resturant restaurant =null;
	
		restaurant=restaurantinterface.findById(id).get();
		return restaurant;
	}
	

}
