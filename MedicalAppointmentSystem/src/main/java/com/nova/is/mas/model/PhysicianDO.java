package com.nova.is.mas.model;


public class PhysicianDO {
	private int physicianID;
	private String lastName;
	private String firstName;
	private String specialization;
	private int fee;
	private long phoneNumber;
	public int getPhysicianID() {
		return physicianID;
	}
	public void setPhysicianID(int physicianID) {
		this.physicianID = physicianID;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
