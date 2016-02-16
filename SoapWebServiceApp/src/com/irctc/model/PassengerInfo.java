package com.irctc.model;

public class PassengerInfo {

	private int passengerId,age;
	private String passengerName,fromAddr,toAddr;
	
	public PassengerInfo(){
		
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getFromAddr() {
		return fromAddr;
	}
	public void setFromAddr(String fromAddr) {
		this.fromAddr = fromAddr;
	}
	public String getToAddr() {
		return toAddr;
	}
	public void setToAddr(String toAddr) {
		this.toAddr = toAddr;
	}
}
