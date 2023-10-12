package com.globallogic.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Token {
	
	private int tokenId;
	private int checkInTime;
	private int checkOutTime;
	
	@Autowired
	private Vehicle vehicle;
	public Token() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Token(int tokenId, int checkInTime, int checkOutTime, Vehicle vehicle) {
		super();
		this.tokenId = tokenId;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.vehicle = vehicle;
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
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "Token [tokenId=" + tokenId + ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime
				+ ", vehicle=" + vehicle + "]";
}

	
	
}
