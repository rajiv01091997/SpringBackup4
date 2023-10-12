package com.globallogic.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int empId;
	private String empName;
	private List<String> listOfColleagues=new ArrayList();
	private Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, List<String> listOfColleagues, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.listOfColleagues = listOfColleagues;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getListOfColleagues() {
		return listOfColleagues;
	}
	public void setListOfColleagues(List<String> listOfColleagues) {
		this.listOfColleagues = listOfColleagues;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	

}
