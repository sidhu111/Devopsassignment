package com.htc.aggregateservice.entity;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.Transient;

public class Restaurant {

	
	private String id;
	private int tables;
	private String name;
	private String address;
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Restaurant(String id, int tables, String name, String address) {
		super();
		this.id = id;
		this.tables = tables;
		this.name = name;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTables() {
		return tables;
	}
	public void setTables(int tables) {
		this.tables = tables;
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
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", tables=" + tables + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
