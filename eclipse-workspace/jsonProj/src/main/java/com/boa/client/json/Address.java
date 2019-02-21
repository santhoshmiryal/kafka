package com.boa.client.json;

public class Address {

	private String location;
	private String city;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public Address(String location, String city) {
		super();
		this.location = location;
		this.city = city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
