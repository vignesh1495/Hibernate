package com.person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="VEHICLE")
public class Vehicle {

	

	@Id @GeneratedValue
	@Column(name="VEHICLE_ID")
	private int id;

	@Column(name="VEHICLE_NAME")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
