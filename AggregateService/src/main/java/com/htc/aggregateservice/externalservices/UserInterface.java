package com.htc.aggregateservice.externalservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.htc.aggregateservice.entity.User;



@Component
@FeignClient(url="http://localhost:8081",name="UserService")
public interface UserInterface {
	
	@GetMapping("/api/user/{id}") 
	public User getUserByid(@PathVariable String id);

}
