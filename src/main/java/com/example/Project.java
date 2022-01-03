package com.example;

import javax.persistence.Embeddable;

@Embeddable
public class Project {
	
	private String pname;
	private String country;
	private String pmanager;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPmanager() {
		return pmanager;
	}
	public void setPmanager(String pmanager) {
		this.pmanager = pmanager;
	}

	
	

}
