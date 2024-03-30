package com.ashokit.model;

public class Employee {
	
	private Integer employeeId;
	
	private String employeeName;
	
	private String emailId;
	
	public Employee() {
	}
	
	public Employee(Integer employeeId, String employeeName, String emailId) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.emailId = emailId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getEmailId() {
		return emailId;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emailId=" + emailId + "]";
	}
}
