package com.SpringBeanScopeXMLConfigAutowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeRole;
	private double employeeSalary;
	
	private Department department;
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, String employeeRole, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
	}
	
	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeRole="
				+ employeeRole + ", employeeSalary=" + employeeSalary + ", department=" + department + "]";
	}

}
