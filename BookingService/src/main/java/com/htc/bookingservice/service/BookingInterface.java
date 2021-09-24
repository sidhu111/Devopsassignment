package com.htc.bookingservice.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.bookingservice.entity.Booking;



@Repository
public interface BookingInterface  extends JpaRepository<Booking, String>{
	

}
