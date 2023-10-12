package com.globallogic.Model;

public class Vehicle {
	
	private int vehicleId;
	private String vehivleName;
	private String ownerName;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int vehicleId, String vehivleName, String ownerName) {
		super();
		this.vehicleId = vehicleId;
		this.vehivleName = vehivleName;
		this.ownerName = ownerName;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehivleName() {
		return vehivleName;
	}

	public void setVehivleName(String vehivleName) {
		this.vehivleName = vehivleName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	
	

}
