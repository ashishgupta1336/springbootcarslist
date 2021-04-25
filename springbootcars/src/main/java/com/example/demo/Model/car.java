package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String carName;
	private String emailId;
	private String mobileNumber;
	
	public car() {
		//default Constructor
	}
	
	public car(String carName, String emailId, String mobileNumber) {
		super();
		this.carName = carName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getcarName() {
		return carName;
	}
	public void setcarName(String carName) {
		this.carName = carName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	

}

