package com.boa.client.json;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
//@XmlType(propOrder= {"empId","empName","designation"})
public class Employee {

	private int empId;
	private Address address;

	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int i, String string, String string2) {
		this.empId=i;
		this.empName=string;
		this.designation=string2;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	private String empName;
	private String designation;

}
