package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity(name="USER_DETAILS")
public class Employee {

	
		@Id @GeneratedValue
		@Column(name="USER_ID")
		private int id;
	
		@Column(name="USER_NAME")
		private String name;
		
		@Temporal (TemporalType.DATE)
		private Date dob;
		
		@Transient
		private String address;
		
		@ElementCollection
		@JoinTable(name="USER_Project",
		joinColumns=@JoinColumn(name="USER_ID"))
		@GenericGenerator(name="hilo-gen",strategy="hilo")
		@CollectionId(columns = { @Column(name="Project_id") }, generator = "hilo-gen", type = @Type(type="long"))
		List<Project> project = new ArrayList<Project>();
		
		public List<Project> getProject() {
			return project;
		}
		public void setProject(List<Project> project) {
			this.project = project;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
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
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + "]";
		}
}
