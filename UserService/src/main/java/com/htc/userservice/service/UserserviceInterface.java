package com.htc.userservice.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htc.userservice.entity.User;



@Repository
public interface UserserviceInterface extends JpaRepository<User, String>  {
	
	@Query(value="select * from User where phone_no=?1",nativeQuery = true)
	public User findByPhoneno(long phoneNo);

}
