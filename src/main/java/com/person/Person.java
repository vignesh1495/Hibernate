package com.person;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity(name="PERSON")
public class Person {

	
	@Id @GeneratedValue
	@Column(name="PERSON_ID")
	private int id;

	@Column(name="PERSON_NAME")
	private String name;
	
	@OneToOne
	@JoinColumn(name="VEHICLE_ID")
	private Vehicle vehicle;
	
	@OneToMany
	@JoinTable(name="Person_Company", joinColumns=@JoinColumn(name="PERSON_ID"),
	inverseJoinColumns=@JoinColumn(name="COMPANY_ID"))
	private Collection<Company> company =new ArrayList<Company>();

	
	
	public Collection<Company> getCompany() {
		return company;
	}

	public void setCompany(Collection<Company> company) {
		this.company = company;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
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
