package com.htc.bookingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.bookingservice.entity.Booking;

import com.htc.bookingservice.service.BookingInterface;



@RestController
@RequestMapping("/api")
public class Bookingcontroller {

	 
	 
	 
	 @Autowired
	 private BookingInterface bookinginterface;
	 
	 @GetMapping("/booking/{restaurantId}")
		Booking getResterantbyRestaurantId(@PathVariable String restaurantId)
		{
		 
		 Booking bookingdetails =null;
		 bookingdetails=bookinginterface.getById(restaurantId);
		 
			return bookingdetails;
			
		}
	 
	
	 @PostMapping("/addbooking")
		Booking BookingRestaurant(@RequestBody Booking booking)
		{
			return bookinginterface.save(booking);
			
		}
		
	 
	
}
