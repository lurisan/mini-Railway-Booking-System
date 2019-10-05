package com.base;

public class Passenger {
	
	private String passengerName;
	private String gender;
	private String source;
	private String destination;
	
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public Passenger(String passengerName, String gender, String source,
			String destination) {
		super();
		this.passengerName = passengerName;
		this.gender = gender;
		this.source = source;
		this.destination = destination;
	}
	public Passenger() {
		super();
	}
	
	@Override
	public String toString() {
		return "Passenger [passengerName=" + passengerName + ", gender="
				+ gender + ", source=" + source + ", destination="
				+ destination + "]";
	}
}
