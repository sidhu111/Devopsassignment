package com.htc.aggregateservice.externalservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.htc.aggregateservice.entity.Booking;



@Component
@FeignClient(url="http://localhost:8083",name="bookingservices")
public interface BookingInterface {
	
	 @GetMapping("/api/booking/{restaurantId}")
		Booking getResterantbyRestaurantId(@PathVariable String restaurantId);

}
