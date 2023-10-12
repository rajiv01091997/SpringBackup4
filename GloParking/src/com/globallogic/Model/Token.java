package com.globallogic.Model;

public class Token {
	
	private int tokenId;
	private int checkInTime;
	private int checkOutTime;
	private int vehicleId;
	public Token() {
		super();
		
	}
	public Token(int tokenId, int checkInTime, int checkOutTime, int vehicleId) {
		super();
		this.tokenId = tokenId;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.vehicleId = vehicleId;
	}
	public int getTokenId() {
		return tokenId;
	}
	public void setTokenId(int tokenId) {
		this.tokenId = tokenId;
	}
	public int getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(int checkInTime) {
		this.checkInTime = checkInTime;
	}
	public int getCheckOutTime() {
		return checkOutTime;
	}
	public void setCheckOutTime(int checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	
	
	
}
