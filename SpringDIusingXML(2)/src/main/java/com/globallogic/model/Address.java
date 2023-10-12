package com.globallogic.model;

public class Address {
	
	private String city;
	private String state;
	private long pin;
	
	
	
	public Address() {
		super();
		System.out.println("address constructor called");
	}



	public Address(String city, String state, long pin) {
		super();
		this.city = city;
		this.state = state;
		this.pin = pin;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public long getPin() {
		return pin;
	}



	public void setPin(long pin) {
		this.pin = pin;
	}



	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}
	
	
	

}
