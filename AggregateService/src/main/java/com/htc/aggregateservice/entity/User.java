package com.htc.aggregateservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class User {
	
	

	private String id;
	private String name;
	private String address;
	private String city;
	private long phoneNo;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String id, String name, String address, String city, long phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.phoneNo = phoneNo;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", phoneNo=" + phoneNo
				+ "]";
	}

	
	
}
