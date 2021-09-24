package com.htc.aggregateservice.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Booking {
	
	private String restaurantId;
	private String userId;
	private LocalDate date;
	private LocalTime time;
	private String tableId;
	private String id;
	private String name;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(String restaurantId, String userId, LocalDate date, LocalTime time, String tableId, String id,
			String name) {
		super();
		this.restaurantId = restaurantId;
		this.userId = userId;
		this.date = date;
		this.time = time;
		this.tableId = tableId;
		this.id = id;
		this.name = name;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getTableId() {
		return tableId;
	}
	public void setTableId(String tableId) {
		this.tableId = tableId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Booking [restaurantId=" + restaurantId + ", userId=" + userId + ", date=" + date + ", time=" + time
				+ ", tableId=" + tableId + ", id=" + id + ", name=" + name + "]";
	}
	

}
