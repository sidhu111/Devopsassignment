package com.htc.bookingservice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.htc.bookingservice.entity.Booking;
import com.htc.bookingservice.service.BookingInterface;



@SpringBootTest
class AppointmentmanagementApplicationTests {
	@Autowired
	BookingInterface bookinginterface;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testAppointment() {
		Booking booking = new Booking();
		booking.setRestaurantId(restaurantId);
		booking.setTime(time);
		booking.setTableId(tableId);
		booking.setDate(date);
		booking.setUserId(userId);
		booking.setId(id);
		booking.setName(name);
		
		bookinginterface.save(booking);
		
		assertNotNull(bookinginterface.getById(id);
	}



}
