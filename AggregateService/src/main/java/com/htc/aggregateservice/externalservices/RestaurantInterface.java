package com.htc.aggregateservice.externalservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.htc.aggregateservice.entity.Restaurant;



@Component
@FeignClient(url="http://localhost:8082",name="RestaurantService")
public interface RestaurantInterface {
	
	
	@GetMapping("/api/user/{id}") 
	public Restaurant getRestaurantByid(@PathVariable String id); 

}
