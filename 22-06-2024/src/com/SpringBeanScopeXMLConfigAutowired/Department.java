package com.SpringBeanScopeXMLConfigAutowired;

public class Department {

	private int departmentId;
	private String departmentName;

	public Department() {

	}

	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}

}
