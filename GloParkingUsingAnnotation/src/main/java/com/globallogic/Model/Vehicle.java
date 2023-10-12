package com.globallogic.Model;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	
	private int vehicleId;
	private String vehicleName;
	private String ownerName;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int vehicleId, String vehicleName, String ownerName) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.ownerName = ownerName;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", ownerName=" + ownerName + "]";
	}
	
	
	

	}
	
	
	
	


